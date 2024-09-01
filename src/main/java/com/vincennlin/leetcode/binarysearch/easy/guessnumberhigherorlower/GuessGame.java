package com.vincennlin.leetcode.binarysearch.easy.guessnumberhigherorlower;

public class GuessGame {
    private int pickedNumber;

    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public int guess(int num) {
        if (num < pickedNumber) {
            return 1;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 0;
        }
    }
}
