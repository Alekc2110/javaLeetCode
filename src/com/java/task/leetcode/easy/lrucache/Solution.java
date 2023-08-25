package com.java.task.leetcode.easy.lrucache;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        LRUCache2Var lruCache2Var = new LRUCache2Var(2);
        LRUCacheCopy lruCacheCopy = new LRUCacheCopy(2);

//      Output
//      [null, null, null, 1, null, -1, null, -1, 3, 4]
        lruCacheCopy.put(1, 1);
        lruCacheCopy.put(2, 2);
        System.out.println(lruCacheCopy.get(1));
        lruCacheCopy.put(3, 3);
        System.out.println(lruCacheCopy.get(2));
        lruCacheCopy.put(4, 4);
        System.out.println(lruCacheCopy.get(1));
        System.out.println(lruCacheCopy.get(3));
        System.out.println(lruCacheCopy.get(4));
    }
}

/**
 *Implement the LRUCache class:
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 */
class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity,0.75f, true);
        this.capacity = capacity;

    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
       super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
       return super.size() > capacity;
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 * head and tail nodes -> constant nodes as borders of linkedList, they are not changed
 * When we move node -> we move it before the tail
 * When we delete node -> we delete first node before head
 */

class LRUCache2Var {
    private Map<Integer, ListNode> cache;
    private ListNode head;
    private ListNode tail;
    private int capacity;

    public LRUCache2Var(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new ListNode(0, 0);
        tail = new ListNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        ListNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToTail(node);
        return node.val;
    }

    public void put(int key, int value) {
        ListNode node = cache.get(key);
        if (node != null) {
            node.val = value;
            moveToTail(node);
        } else {
            if (cache.size() == capacity) {
                cache.remove(head.next.key);
                removeNode(head.next);
            }
            node = new ListNode(key, value);
            cache.put(key, node);
            addToTail(node);
        }
    }

    private void moveToTail(ListNode node) {
        removeNode(node);
        addToTail(node);
    }

    private void addToTail(ListNode node) {
        ListNode prev = tail.prev;
        node.prev = prev;
        tail.prev.next = node;
        tail.prev = node;
        node.next = tail;
    }

    private void removeNode(ListNode node) {
        ListNode next = node.next;
        node.prev.next = next;
        ListNode prev = node.prev;
        node.next.prev = prev;
    }

    class ListNode {
        int key;
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

class LRUCacheCopy {
    private final Map<Integer,Node> cache;
    private final int capacity;
    private final Node head;
    private final Node tail;

    public LRUCacheCopy(int capacity) {
        cache = new HashMap<>(capacity);
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.previous = head;
    }

    public int get(int key){
        Node node = cache.get(key);
        if(node == null){
            return -1;
        }
        moveToTail(node);
        return node.value;
    }

    public void put(int key, int value){
        Node node = cache.get(key);
        if(node != null){
            node.value = value;
            moveToTail(node);
        } else {
            if(cache.size() == capacity){  // if cache size == capacity -> remove 1st node after head
                Node nodeToRemove = head.next;
                cache.remove(nodeToRemove.key);
                Node nextNode =  nodeToRemove.next;
                head.next = nextNode;
                nextNode.previous = head;
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToTail(newNode);
        }
    }

    private void moveToTail(Node node) {
        removeNode(node);
        addToTail(node);
    }

    private void removeNode(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        previous.next = next;
        next.previous = previous;

    }

    private void addToTail(Node node) {
        Node previous = tail.previous;
        previous.next = node;
        node.next = tail;
        node.previous = previous;
        tail.previous = node;
    }


    static class Node{
        private final int key;
        private int value;

        private Node previous;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

