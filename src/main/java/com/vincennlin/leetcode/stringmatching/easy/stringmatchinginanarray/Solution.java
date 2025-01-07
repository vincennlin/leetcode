package com.vincennlin.leetcode.stringmatching.easy.stringmatchinginanarray;

import java.util.ArrayList;
import java.util.List;

// 1408
// Trie
class Solution {
    class Node {
        Node[] children;
        int count;

        Node() {
            children = new Node[26];
            count = 0;
        }
    }

    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        Node root = new Node();

        for (String word : words) {
            for (int startIndex = 0; startIndex < word.length(); startIndex++) {
                insertWord(root, word.substring(startIndex));
            }
        }

        for (String word : words) {
            if (isSubstring(root, word)) {
                result.add(word);
            }
        }

        return result;
    }

    private void insertWord(Node root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                root.children[c - 'a'] = new Node();
            }
            root = root.children[c - 'a'];
            root.count++;
        }
    }

    private boolean isSubstring(Node root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                return false;
            }
            root = root.children[c - 'a'];
        }
        return root.count > 1;
    }
}

// LPS

//class Solution {
//    public List<String> stringMatching(String[] words) {
//        List<String> result = new ArrayList<>();
//
//        for (int subIndex = 0; subIndex < words.length; subIndex++) {
//            String sub = words[subIndex];
//            int[] lps = getLpsArray(sub);
//
//            for (int mainIndex = 0; mainIndex < words.length; mainIndex++) {
//                if (subIndex == mainIndex) {
//                    continue;
//                }
//
//                String main = words[mainIndex];
//
//                if (isSubstring(main, sub, lps)) {
//                    result.add(sub);
//                    break;
//                }
//            }
//        }
//
//        return result;
//    }
//
//    private int[] getLpsArray(String word) {
//        int n = word.length();
//        int[] lps = new int[n];
//        int currentIndex = 1, len = 0;
//
//        while (currentIndex < n) {
//            if (word.charAt(currentIndex) == word.charAt(len)) {
//                len++;
//                lps[currentIndex] = len;
//                currentIndex++;
//            } else {
//                if (len > 0) {
//                    len = lps[len - 1];
//                } else {
//                    currentIndex++;
//                }
//            }
//        }
//
//        return lps;
//    }
//
//    private boolean isSubstring(String main, String sub, int[] lps) {
//        int mainIndex = 0, subIndex = 0;
//
//        while (mainIndex < main.length()) {
//            if (main.charAt(mainIndex) == sub.charAt(subIndex)) {
//                mainIndex++;
//                subIndex++;
//                if (subIndex == sub.length()) {
//                    return true;
//                }
//            } else {
//                if (subIndex > 0) {
//                    subIndex = lps[subIndex - 1];
//                } else {
//                    mainIndex++;
//                }
//            }
//        }
//
//        return false;
//    }
//}
