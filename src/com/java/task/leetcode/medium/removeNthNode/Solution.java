package com.java.task.leetcode.medium.removeNthNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * Example 1:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * <p>
 * Example 2:
 * Input: head = [1], n = 1
 * Output: []
 * <p>
 * Example 3:
 * Input: head = [1,2], n = 1
 * Output: [1]
 */
public class Solution {


    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))); // 1 2 3 5
        ListNode res = removeNthFromEnd(root, 2);
        printRoot(res);
        System.out.println();

        ListNode root2 = new ListNode(1, new ListNode(2)); // 1
        ListNode res2 = removeNthFromEnd(root2, 1);
        printRoot(res2);
        System.out.println();

        ListNode root3 = new ListNode(1);
        ListNode res3 = removeNthFromEnd(root3, 1); // null
        printRoot(res3);
        System.out.println();

        ListNode res5 = removeNthFromEnd(null, 1); // null
        printRoot(res5);
        System.out.println();

        ListNode root4 = new ListNode(1, new ListNode(2)); // 2
        ListNode res4 = removeNthFromEnd(root4, 2);
        printRoot(res4);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size += 1;
            cur = cur.next;
        }
        if (size == 0) {
            return null;
        }

        if (n >= size) {
            ListNode next = head.next;
            head = null;
            return next;
        }
        int stepsCount = size - n;
        cur = head;
        while (stepsCount > 1) {
            cur = cur.next;
            stepsCount--;
        }
        ListNode toRemove = cur.next;
        if(toRemove.next == null){
            cur.next = null;
            return head;
        }
        cur.next = toRemove.next;
        return head;
    }

    private static void printRoot(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
