package com.vincennlin.leetcode.design.medium.productofthelastknumbers;

import java.util.ArrayList;
import java.util.List;

// 1352
class ProductOfNumbers {

    List<Integer> prefixSum;
    int allProduct;

    public ProductOfNumbers() {
        prefixSum = new ArrayList<>();
        allProduct = 0;
    }

    public void add(int num) {
        if (num == 0) {
            prefixSum.clear();
            allProduct = 0;
        } else if (prefixSum.isEmpty()){
            prefixSum.add(num);
            allProduct = num;
        } else {
            prefixSum.add(num * prefixSum.get(prefixSum.size() - 1));
            allProduct *= num;
        }
    }

    public int getProduct(int k) {
        if (k > prefixSum.size()) {
            return 0;
        } else if (k == prefixSum.size()){
            return allProduct;
        } else {
            return allProduct / prefixSum.get(prefixSum.size() - 1 - k);
        }
    }
}