package com.java.task.leetcode.easy.kClosestPointsToOrigin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Solution {
    public static int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] pl, int[] pr) {
                return (pl[0] - pr[0]) * (pl[0] + pr[0]) + (pl[1] - pr[1]) * (pr[1] + pl[1]);
            }
        });
        return Arrays.copyOf(points, k);
    }

    public int[][] kClosestWithPriorityQueue(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        for (int[] p : points) {
            pq.offer(p);
            if (pq.size() > K) {
                pq.poll();
            }
        }
        int[][] res = new int[K][2];
        while (K > 0) {
            res[--K] = pq.poll();
        }
        return res;
    }
}
