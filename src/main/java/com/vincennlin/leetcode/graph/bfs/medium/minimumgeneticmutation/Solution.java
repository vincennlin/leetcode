package com.vincennlin.leetcode.graph.bfs.medium.minimumgeneticmutation;

import java.util.*;

// 433
class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>(List.of(bank));
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        int mutations = 0;

        queue.add(startGene);
        visited.add(startGene);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                if (current.equals(endGene)) {
                    return mutations;
                }

                char[] currentArray = current.toCharArray();
                for (int j = 0; j < currentArray.length; j++) {
                    char originalChar = currentArray[j];

                    for (char c : new char[]{'A', 'C', 'G', 'T'}) {
                        if (originalChar == c) continue;

                        currentArray[j] = c;

                        String next = new String(currentArray);

                        if (bankSet.contains(next) && !visited.contains(next)) {
                            queue.add(next);
                            visited.add(next);
                        }
                    }

                    currentArray[j] = originalChar;
                }
            }

            mutations++;
        }

        return -1;
    }
}
