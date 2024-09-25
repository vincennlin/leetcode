package com.vincennlin.leetcode.trie.medium.sumofprefixscoresofstrings;
// 2416
class Solution {
    public int[] sumPrefixScores(String[] words) {
        int m = words.length;

        Node root = new Node();
        for (String word : words) {
            insert(root, word);
        }

        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            String word = words[i];
            result[i] = getScore(root, word);
        }

        return result;
    }

    private void insert(Node root, String s) {
        for (char c : s.toCharArray()) {
            int path = c - 'a';
            if (root.children[path] == null) {
                root.children[path] = new Node();
            }
            root = root.children[path];
            root.score++;
        }
        root.isEnd = true;
    }

    private int getScore(Node root, String s) {
        int score = 0;
        for (char c : s.toCharArray()) {
            int path = c - 'a';
            if (root.children[path] == null) {
                return 0;
            }
            root = root.children[path];
            score += root.score;
        }
        return score;
    }
}

class Node {
    Node[] children;
    boolean isEnd;
    int score;

    Node() {
        this.children = new Node[26];
    }
}