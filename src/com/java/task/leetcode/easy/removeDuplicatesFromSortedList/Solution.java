package com.java.task.leetcode.easy.removeDuplicatesFromSortedList;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,1,2]
 * Output: [1,2]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
public class Solution {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode listNode = deleteDuplicates(head);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val != cur.next.val) {
                cur = cur.next;
            } else {
                cur.next = cur.next.next;
            }
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}


