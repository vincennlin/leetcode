package com.vincennlin.leetcode.string.easy.countingwordswithagivenprefix;
// 2185
// Trie
class Solution {
    class Node {
        Node[] children;
        int count;

        Node() {
            this.children = new Node[26];
            this.count = 0;
        }
    }

    public int prefixCount(String[] words, String pref) {
        Node root = new Node();

        for (String word : words) {
            insert(root, word);
        }

        return search(root, pref);
    }

    private void insert(Node root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                root.children[c - 'a'] = new Node();
            }
            root = root.children[c - 'a'];
            root.count++;
        }
    }

    private int search(Node root, String prefix) {
        for (char c : prefix.toCharArray()) {
            if (root.children[c - 'a'] == null) {
                return 0;
            }
            root = root.children[c - 'a'];
        }
        return root.count;
    }
}

// Brute Force
//class Solution {
//    public int prefixCount(String[] words, String pref) {
//        int ans = 0;
//
//        for (String word : words) {
//            if (word.startsWith(pref)) {
//                ans++;
//            }
//        }
//
//        return ans;
//    }
//}