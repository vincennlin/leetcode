package com.vincennlin.leetcode.math.medium.checkifnumberisasumofpowersofthree;
// 1780
class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }

        return true;
    }
}