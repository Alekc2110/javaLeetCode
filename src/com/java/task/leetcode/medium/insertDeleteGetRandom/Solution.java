package com.java.task.leetcode.medium.insertDeleteGetRandom;

import java.util.*;

/**
 * Implement the RandomizedSet class:
 * <p>
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists
 * when this method is called). Each element must have the same probability of being returned.
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 * <p>
 * Example 1:
 * Input
 * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
 * [      [],          [1],      [2],      [2],        [],        [1],      [2],        []     ]
 * Output
 * [null, true, false, true, 2, true, false, 2]
 * <p>
 * Explanation
 * RandomizedSet randomizedSet = new RandomizedSet();
 * randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
 * randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
 * randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
 * randomizedSet.insert(2); // 2 was already in the set, so return false.
 * randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
 */
public class Solution {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

//        System.out.println(randomizedSet.insert(1)); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
//        System.out.println(randomizedSet.remove(2)); // Returns false as 2 does not exist in the set.
//        System.out.println(randomizedSet.insert(2)); // Inserts 2 to the set, returns true. Set now contains [1,2].
//        System.out.println(randomizedSet.getRandom()); // getRandom() should return either 1 or 2 randomly.
//        System.out.println(randomizedSet.remove(1)); // Removes 1 from the set, returns true. Set now contains [2].
//        System.out.println(randomizedSet.insert(2)); // 2 was already in the set, so return false.
//        System.out.println(randomizedSet.getRandom()); // Since 2 is the only number in the set, getRandom() will always return 2.
//        System.out.println("***********************");

        randomizedSet = new RandomizedSet();

//        System.out.println(randomizedSet.insert(-1));
//        System.out.println(randomizedSet.remove(-2));
//        System.out.println(randomizedSet.insert(-2));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.remove(-1));
//        System.out.println(randomizedSet.remove(-10));
//        System.out.println(randomizedSet.remove(10));
//
//        System.out.println(randomizedSet.insert(-2));
//        System.out.println(randomizedSet.getRandom());



//        ["RandomizedSet","insert","getRandom","getRandom","getRandom","insert",
//         "insert","insert","insert","insert","getRandom","getRandom","insert",
//         "getRandom","insert","insert","getRandom","getRandom","getRandom","getRandom",
//         "remove","insert","getRandom","getRandom","insert","remove","remove","insert",
//         "getRandom","getRandom","insert","insert","getRandom","remove","remove","insert",
//         "remove","getRandom","getRandom","remove","getRandom","insert","insert","getRandom",
//         "remove","remove","remove","getRandom","insert","insert","insert","insert","getRandom",
//         "insert","getRandom","remove","insert","insert","insert","getRandom","getRandom","insert",
//         "getRandom","insert","insert","getRandom","getRandom","remove","getRandom","remove","insert",
//         "getRandom","insert","insert","insert","getRandom","insert","insert","getRandom","insert",
//         "getRandom","insert","getRandom","getRandom","getRandom","insert","getRandom","getRandom",
//         "insert","insert","insert","getRandom","remove","insert","insert","getRandom","insert",
//         "insert","insert","insert"]

//        [[],[-7],[],[],[],[6],
//        [7],[10],[3],[8],[],[],[-8],
//        [],[6],[-8],[],[],[],[],
//        [2],[2],[],[],[5],[-5],[-8],[-8],
//        [],[],[-4],[10],[],[7],[-1],[8],
//        [-6],[],[],[9],[],[7],[0],[],
//        [-10],[-4],[-3],[],[-4],[-5],[8],[-2],[],
//        [-9],[],[7],[-2],[7],[4],[],[],[-6],
//        [],[-8],[2],[],[],[9],[],[-1],[3],
//        [],[0],[-3],[-1],[],[-8],[-10],[],[3],
//        [],[4],[],[],[],[-10],[],[],
//        [0],[-2],[5],[],[-2],[5],[10],[],[9],
//        [0],[7],[-2]]


        System.out.println(randomizedSet.insert(-7));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(6));
        System.out.println(randomizedSet.insert(7));
        System.out.println(randomizedSet.insert(10));
        System.out.println(randomizedSet.insert(3));
        System.out.println(randomizedSet.insert(8));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(-8));

        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(6));
        System.out.println(randomizedSet.insert(-8));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());

        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(5));
        System.out.println(randomizedSet.remove(-5));
        System.out.println(randomizedSet.remove(-8));
        System.out.println(randomizedSet.insert(-8));

        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(-4));
        System.out.println(randomizedSet.insert(10));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(7));
        System.out.println(randomizedSet.remove(-1));
        System.out.println(randomizedSet.insert(8));

        System.out.println(randomizedSet.remove(-6));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(9));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(7));
        System.out.println(randomizedSet.insert(0));
        System.out.println(randomizedSet.getRandom());

        System.out.println(randomizedSet.remove(-10));
        System.out.println(randomizedSet.remove(-4));
        System.out.println(randomizedSet.remove(-3));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(-4));
        System.out.println(randomizedSet.insert(-5));
        System.out.println(randomizedSet.insert(8));
        System.out.println(randomizedSet.insert(-2));
        System.out.println(randomizedSet.getRandom());

        System.out.println(randomizedSet.insert(-9));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(7));//true
        System.out.println(randomizedSet.insert(-2));
        System.out.println(randomizedSet.insert(7));//true
        System.out.println(randomizedSet.insert(4));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(-6));

//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(-8));
//        System.out.println(randomizedSet.insert(2));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.remove(9));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.remove(-1));
//        System.out.println(randomizedSet.insert(3));
//
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(0));
//        System.out.println(randomizedSet.insert(-3));
//        System.out.println(randomizedSet.insert(-1));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(-8));
//        System.out.println(randomizedSet.insert(-10));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(3));
//
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(4));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(-10));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.getRandom());
//
//        System.out.println(randomizedSet.insert(0));
//        System.out.println(randomizedSet.insert(-2));
//        System.out.println(randomizedSet.insert(5));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.remove(-2));
//        System.out.println(randomizedSet.insert(5));
//        System.out.println(randomizedSet.insert(10));
//        System.out.println(randomizedSet.getRandom());
//        System.out.println(randomizedSet.insert(9));
//
//        System.out.println(randomizedSet.insert(0));
//        System.out.println(randomizedSet.insert(7));
//        System.out.println(randomizedSet.insert(-2));
    }


}

class RandomizedSet {
    private int size;
    private Node[] container;
    private final Random random;


    public RandomizedSet() {
        container = new Node[16];
        random = new Random();
    }

    public boolean insert(int val) {
        int index = calculateBucketIndex(val);
        if (index >= container.length) {
            resizeContainer(index);
        }
        Node newNode = new Node(val, null);
        if (container[index] != null) {
            Node cur = container[index];
            if (cur.key == val) return false;
            while (cur.next != null) {
                if (cur.next.key == val) {
                    return false;
                }
                cur = cur.next;
            }
            cur.next = newNode;
        } else {
            container[index] = newNode;
        }
        size++;
        return true;
    }

    private void resizeContainer(int end) {
        Node[] arr = new Node[end + 1];
        System.arraycopy(container, 0, arr, 0, container.length);
        container = arr;

    }

    public boolean remove(int val) {
        int index = calculateBucketIndex(val);
        if (index > container.length - 1) return false;

        Node cur = container[index];
        if(cur == null){
            return false;
        }

        if(cur.key == val){
            if(cur.next == null){
                container[index] = null;
            }
            container[index] = cur.next;
            size--;
            return true;
        }

        while (cur.next != null) {
            if (cur.next.key == val) {
                cur.next = cur.next.next;
                size--;
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    public int getRandom() {
        int index = random.nextInt(container.length);
        if (size == 0) {
            return -1;
        }
        if (container[index] != null) {
            return container[index].key;
        } else {
            return getRandom();
        }
    }

    public int calculateBucketIndex(int key) {
        return (container.length - 1) & key;
    }

    static class Node {
        final int key;
        Node next;

        public Node(int key, Node next) {
            this.key = key;
            this.next = next;
        }
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

class RandomizedSet1 {
    private final Random random;
    private final Map<Integer, Integer> map;
    private final List<Integer> list;


    public RandomizedSet1() {
        this.random = new Random();
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public boolean insert(int val) {
     if(map.containsKey(val)){
         return false;
     }
     list.add(val);
     map.put(val, list.size() - 1);
     return true;
    }



    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        Integer curIndex = map.get(val);

        Integer lastElement = list.get(list.size() - 1);
        list.set(curIndex, lastElement);
        map.put(lastElement, curIndex);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;

    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}