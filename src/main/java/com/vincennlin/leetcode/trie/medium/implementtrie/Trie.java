package com.vincennlin.leetcode.trie.medium.implementtrie;

import java.util.HashMap;
import java.util.Map;

// 208
class Trie {

    Map<Character, TrieNode> trieMap;

    class TrieNode {
        Map<Character, TrieNode> childrenMap;
        boolean isEnd;

        TrieNode() {
            childrenMap = new HashMap<>();
            isEnd = false;
        }
    }

    public Trie() {
        trieMap = new HashMap<>();
    }

    public void insert(String word) {
        if (word.isEmpty()) return;

        TrieNode currentNode = null;
        Map<Character, TrieNode> currentMap = trieMap;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (currentMap.containsKey(c)) {
                currentNode = currentMap.get(c);
            } else {
                currentNode = new TrieNode();
                if (i == word.length() - 1) {

                }
                currentMap.put(c, currentNode);
            }
            currentMap = currentNode.childrenMap;
        }

        currentNode.isEnd = true;
    }

    public boolean search(String word) {
        if (word.isEmpty()) return false;

        TrieNode currentNode = null;
        Map<Character, TrieNode> currentMap = trieMap;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (currentMap.containsKey(c)) {
                currentNode = currentMap.get(c);
            } else {
                return false;
            }
            currentMap = currentNode.childrenMap;
        }

        return currentNode.isEnd;
    }

    public boolean startsWith(String prefix) {
        if (prefix.isEmpty()) return false;

        TrieNode currentNode = null;
        Map<Character, TrieNode> currentMap = trieMap;

        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (currentMap.containsKey(c)) {
                currentNode = currentMap.get(c);
            } else {
                return false;
            }
            currentMap = currentNode.childrenMap;
        }

        return true;
    }
}
