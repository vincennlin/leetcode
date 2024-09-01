package com.vincennlin.leetcode.binarysearch.easy.guessnumberhigherorlower;
// 374
///**
// * Forward declaration of guess API.
// * @param  num   your guess
// * @return 	     -1 if num is higher than the picked number
// *			      1 if num is lower than the picked number
// *               otherwise return 0
// * int guess(int num);
// */
public class Solution extends GuessGame {
    public Solution(int pickedNumber) {
        super(pickedNumber);
    }

    public int guessNumber(int n) {
        int left = 0, right = n;

        while (left <= right) {
            if (left == right) return left;

            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0;
    }
}
