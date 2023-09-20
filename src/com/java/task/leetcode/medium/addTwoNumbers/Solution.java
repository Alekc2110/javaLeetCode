package com.java.task.leetcode.medium.addTwoNumbers;

import java.math.BigDecimal;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class Solution {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
//        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        //7,0,8
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        //1,9,9,9,9,9,9,9,9,9
//        ListNode l1 = new ListNode(9);
//        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
//                                          new ListNode(9, new ListNode(9, new ListNode(9,
//                                                  new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        ListNode listNode = addTwoNumbers2(l1, l2);
        System.out.print("[");
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("]");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next = l1.next;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(l1.val);
        while (next != null) {
            int val = next.val;
            sb1.append(val);
            next = next.next;
        }

        BigDecimal number1 = new BigDecimal(sb1.reverse().toString());

        ListNode next2 = l2.next;
        sb1 = new StringBuilder();
        sb1.append(l2.val);
        while (next2 != null) {
            int val = next2.val;
            sb1.append(val);
            next2 = next2.next;
        }

        BigDecimal number2 = new BigDecimal(sb1.reverse().toString());

        BigDecimal result = number1.add(number2);

        sb1 = new StringBuilder();
        char[] chars = sb1.append(result).reverse().toString().toCharArray();

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int i = 0; i < chars.length; i++) {
            ListNode nextNode = new ListNode(Integer.parseInt(String.valueOf(chars[i])));
            current.next = nextNode;
            current = current.next;
        }

        return dummy.next;
    }


    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // creating a dummy list
        ListNode curr = dummy; // initialising a pointer
        int carry = 0; // initialising our carry with 0 init
        // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it.
        // We will add that as well into our list
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0; // initialising our sum
            if (l1 != null) { // adding l1 to our sum & moving l1
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) { // adding l2 to our sum & moving l2
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; // if we have carry then add it into our sum
            carry = sum / 10; // if we get carry, then divide it by 10 to get the carry
            ListNode node = new ListNode(sum % 10); // the value we'll get by modeling it, will become as new node so. add it to our list
            curr.next = node; // curr will point to that new node if we get
            curr = curr.next; // update the current every time
        }
        return dummy.next; // return dummy.next bcz, we don't want the value we have considered in it initially!!
    }

    static class ListNode {
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

}

