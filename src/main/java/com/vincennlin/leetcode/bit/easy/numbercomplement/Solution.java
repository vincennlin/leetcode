package com.vincennlin.leetcode.bit.easy.numbercomplement;
//476
class Solution {
    public int findComplement(int num) {
        int count = 0;
        long temp = (long)num;
        while (temp > 0) {
            count++;
            temp /= 2;
        }
        return (int)(Math.pow(2, count) - 1) - num ;
    }
}
