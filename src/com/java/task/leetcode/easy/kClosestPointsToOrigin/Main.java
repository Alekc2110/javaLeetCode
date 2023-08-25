package com.java.task.leetcode.easy.kClosestPointsToOrigin;

import java.util.*;

/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 * <p>
 * ORIGIN: {0,0}
 * Example:
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{3, 3}, {5, -1}, {-2, 4}};
        System.out.println(Arrays.deepToString(returnKClosestPointsToOrigin(arr, 1)));
//        System.out.println(Arrays.deepToString(Solution.kClosest(arr, 2)));


//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(10);
//        pq.add(5);
//        System.out.println(pq);
//        pq.add(2);
//        pq.add(25);
//        pq.add(0);
//        pq.add(50);
//        System.out.println(pq);
////        pq.forEach(v-> System.out.print(v + " "));
//        for (int i = 0; i < pq.size(); i++) {
//            System.out.print(pq.poll() + " ");
//            i--;
//        }
//        System.out.println();
//        System.out.println(pq.size());
//        Iterator<Integer> pqIter = pq.iterator();
//        while (pqIter.hasNext()){
//            System.out.print(pq.remove()+ " ");
//        }
//        pq.stream().map(integer -> pq.remove() + " ") !!! ConcurrentModificationException
//                .forEach(System.out::print);

//        System.out.println();
//        System.out.println("***");
//        ArrayDeque<Integer> q = new ArrayDeque<>();
//        q.add(10);
//        q.offer(5);
//        q.addLast(1);
//        q.addFirst(11);
//        System.out.println(q);
//        q.add(2);
//        q.add(25);
//        q.add(0);
//        q.add(50);
//        System.out.println(q);
       // q.forEach(v-> System.out.print(v + " "));
//        for (int v: q) {
//            System.out.print(q.peek());
//        }

//        Iterator<Integer> desIter = q.descendingIterator();
//        while (desIter.hasNext()) {
//            System.out.print(q.poll() + " ");
//            desIter.next();
//        }
//        System.out.println();
//        System.out.println("******");
//        q.stream().map(integer -> q.remove() + " ")
//                .forEach(System.out::print);
//        System.out.println();
//        System.out.println(q.size());

    }

    static int[][] returnKClosestPointsToOrigin(int[][] arr, int k) {
        // compact view -> Arrays.sort(arr, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        int[][] copy = new int[k][2];
        System.arraycopy(arr, 0, copy, 0,
                Math.min(arr.length, k));
        return copy;
    }

}
