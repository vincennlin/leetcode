package com.vincennlin.leetcode.trie.medium.implementtrie;

// 208
class Trie {

    TrieNode root;

    class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;

        for (char c : word.toCharArray()) {
            if (currentNode.children[c - 'a'] == null) {
                currentNode.children[c - 'a'] = new TrieNode();
            }
            currentNode = currentNode.children[c - 'a'];
        }

        currentNode.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    private TrieNode searchNode(String str) {
        TrieNode currentNode = root;
        for (char c : str.toCharArray()) {
            currentNode = currentNode.children[c - 'a'];
            if (currentNode == null) return null;
        }
        return currentNode;
    }
}
