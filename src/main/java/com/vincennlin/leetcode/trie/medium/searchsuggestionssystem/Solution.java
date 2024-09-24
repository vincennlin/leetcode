package com.vincennlin.leetcode.trie.medium.searchsuggestionssystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1268
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        Node root = new Node();
        for (String product : products) {
            insert(root, product);
        }

        List<List<String>> result = new ArrayList<>();
        for(int i = 1; i <= searchWord.length(); i++) {
            String subString = searchWord.substring(0, i);
            Node currentNode = search(root, subString);
            if (currentNode != null) {
                result.add(dfs(currentNode, new ArrayList<>(), new StringBuilder(subString)));
            } else {
                result.add(new ArrayList<>());
            }
        }

        return result;
    }

    private void insert(Node root, String str) {
        for (char c : str.toCharArray()) {
            int path = c - 'a';
            if (root.children[path] == null) {
                root.children[path] = new Node();
            }
            root = root.children[path];
        }
        root.isEnd = true;
    }

    private Node search(Node root, String str) {
        for (char c : str.toCharArray()) {
            int path = c - 'a';
            if (root.children[path] == null) {
                return null;
            }
            root = root.children[path];
        }
        return root;
    }

    private List<String> dfs(Node root, List<String> result, StringBuilder sb) {
        if (root.isEnd && result.size() < 3) {
            result.add(sb.toString());
        }
        if (result.size() >= 3) {
            return result;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                sb.append((char)('a' + i));
                dfs(root.children[i], result, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return result;
    }
}

class Node {
    Node[] children;
    boolean isEnd;

    Node() {
        this.children = new Node[26];
    }
}
