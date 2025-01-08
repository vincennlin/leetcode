package com.vincennlin.leetcode.stringmatching.easy.countprefixandsuffixpairsi;
// 3042
// Trie
class Solution {
    class Node {
        Node[] children;

        Node() {
            children = new Node[26];
        }
    }

    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        Node root1 = new Node();
        Node root2 = new Node();

        for (String word : words) {
            insert(root1, word);
            StringBuilder wordSb = new StringBuilder(word).reverse();
            insert(root2, wordSb.toString());
        }

        int ans = 0;

        for (String word : words) {
            if (search(root1, word) && search(root2, word)) {
                ans++;
            }
        }

        return ans;
    }

    private void insert(Node root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                root.children[c - 'a'] = new Node();
            }
            root = root.children[c - 'a'];
        }
    }

    private boolean search(Node root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                return false;
            }
            root = root.children[c - 'a'];
        }
        return true;
    }
}

// Brute Force
//class Solution {
//    public int countPrefixSuffixPairs(String[] words) {
//        int n = words.length;
//        int ans = 0;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (isPrefixAndSuffix(words[i], words[j])) {
//                    ans++;
//                }
//            }
//        }
//
//        return ans;
//    }
//
//    private boolean isPrefixAndSuffix(String str1, String str2) {
//        return str2.startsWith(str1) && str2.endsWith(str1);
//    }
//}