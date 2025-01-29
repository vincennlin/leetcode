package com.vincennlin.leetcode.unionfind.medium.redundantconnection;
// 684
class Solution {

    class DSU {
        private int N;
        private int[] size;
        private int[] root;

        public DSU(int N) {
            this.N = N;
            size = new int[N];
            root = new int[N];

            for (int node = 0; node < N; node++) {
                size[node] = 1;
                root[node] = node;
            }
        }

        public int find(int node) {
            if (root[node] == node) {
                return node;
            }

            root[node] = find(root[node]);
            return root[node];
        }

        public boolean doUnion(int nodeOne, int nodeTwo) {
            nodeOne = find(nodeOne);
            nodeTwo = find(nodeTwo);

            if (nodeOne == nodeTwo) {
                return false;
            } else {
                if (size[nodeOne] > size[nodeTwo]) {
                    root[nodeTwo] = nodeOne;
                    size[nodeOne] += size[nodeTwo];
                } else {
                    root[nodeOne] = nodeTwo;
                    size[nodeTwo] += size[nodeOne];
                }
                return true;
            }
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;

        DSU dsu = new DSU(N);

        for (int[] edge : edges) {
            if (!dsu.doUnion(edge[0] - 1, edge[1] - 1)) {
                return edge;
            }
        }

        return null;
    }
}
