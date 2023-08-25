package com.java.task.leetcode.easy.merge2LinkedLists;

public class Main {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(9, new ListNode(50)))));
        ListNode list2 = new ListNode(0, new ListNode(2, new ListNode(10)));

        ListNode res = new Solution().mergeTwoLists(list1, list2);

        var cur = res;

        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;

        }

    }
}
