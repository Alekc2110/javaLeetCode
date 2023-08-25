package com.java.task.leetcode.easy.merge2LinkedLists;

public class Solution {

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        //create dummy(fake) Node to link to first element in new Linked list
        ListNode dummyHead = new ListNode(-1);

        ListNode currentNode = dummyHead;

        // not necessary -> just for better understanding, create 2 var. of current elements for iterating in loop
        ListNode currHead1 = head1;
        ListNode currHead2 = head2;

        //go while get to the end of list1 or list2
        while (currHead1 != null && currHead2 != null) {
            //if current elem value in curNode1 > current elem value in curNode2,
            //then link dummyHead.next to currentNode in list1 and shift current Head1 to next linked Node
            if(currHead1.val < currHead2.val){
                currentNode.next = currHead1;
                currHead1 = currHead1.next;
            //otherwise, link dummy to current Head2 and shift curHead2 to next Node to check in another loop iteration
            } else {
                currentNode.next = currHead2;
                currHead2 = currHead2.next;
            }
            //shift pointer to current Node, that we will link with next Node in another loop
            currentNode = currentNode.next;
        }

        //if list1 bigger than list2 we should link elements left after while loop comparing
        if(currHead1 != null){
            currentNode.next = currHead1;
        }
        //if list2 bigger than list1 we should link elements left after while loop comparing
        if(currHead2 != null){
            currentNode.next = currHead2;
        }
        //delete dummyNode and return dummy.next elem as head of new Linked list
        ListNode listHead = dummyHead.next;
        dummyHead = null;

        return listHead;
    }
}
