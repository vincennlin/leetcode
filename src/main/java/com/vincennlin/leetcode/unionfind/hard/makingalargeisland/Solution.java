package com.vincennlin.leetcode.unionfind.hard.makingalargeisland;

import java.util.HashSet;
import java.util.Set;

// 827
class Solution {

    int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1 , 0}, {0, -1}};

    class DSU {
        private int N;
        private int[] size;
        private int[] root;

        public DSU(int n, int[][] grid) {
            this.N = n * n;
            this.size = new int[N];
            this.root = new int[N];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int node = i * n + j;
                    root[node] = node;
                    if (grid[i][j] == 1) {
                        size[node] = 1;
                    }
                }
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


    public int largestIsland(int[][] grid) {
        int n = grid.length;

        DSU dsu = new DSU(n, grid);

        boolean[][] isVisited = new boolean[n][n];
        boolean hasZero = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    isVisited[i][j] = true;
                    hasZero = true;
                }
            }
        }

        if (!hasZero) {
            return n * n;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!isVisited[i][j]) {
                    dfs(i, j, n, isVisited, dsu);
                }
            }
        }

        int maxIslandSize = 0;
        Set<Integer> uniqueRoots = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    int currentIslandSize = 1;
                    for (int[] direction : directions) {
                        int nextI = i + direction[0];
                        int nextJ = j + direction[1];
                        if (isValid(nextI, nextJ, n) && grid[nextI][nextJ] == 1) {
                            int neighborNode = nextI * n + nextJ;
                            int root = dsu.find(neighborNode);
                            uniqueRoots.add(root);
                        }
                    }

                    for (int root : uniqueRoots) {
                        currentIslandSize += dsu.size[root];
                    }

                    uniqueRoots.clear();

                    maxIslandSize = Math.max(maxIslandSize, currentIslandSize);
                }
            }
        }

        return maxIslandSize;
    }

    private void dfs(int i, int j, int n, boolean[][] isVisited, DSU dsu) {
        isVisited[i][j] = true;
        for (int[] direction : directions) {
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            if (isValid(nextI, nextJ, n) && !isVisited[nextI][nextJ]) {
                dsu.doUnion(i * n + j, nextI * n + nextJ);
                dfs(nextI, nextJ, n, isVisited, dsu);
            }
        }
    }

    private boolean isValid(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}