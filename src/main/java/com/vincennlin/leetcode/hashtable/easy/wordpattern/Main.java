package com.vincennlin.leetcode.hashtable.easy.wordpattern;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: pattern = "abba", s = "dog cat cat dog"
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern1, s1)); // Output: true

        // Example 2: pattern = "abba", s = "dog cat cat fish"
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(solution.wordPattern(pattern2, s2)); // Output: false

        // Example 3: pattern = "aaaa", s = "dog cat cat dog"
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern3, s3)); // Output: false

        // Additional Example: pattern = "abc", s = "dog cat fish"
        String pattern4 = "abc";
        String s4 = "dog cat fish";
        System.out.println(solution.wordPattern(pattern4, s4)); // Output: true
    }
}
