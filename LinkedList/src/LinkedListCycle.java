/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode pt1=head, pt2 = head;
        if(head == null){
            return false;
        }
        while((pt1.next != null) && (pt2.next != null) && (pt2.next.next != null)){
            if (pt1.next != pt2.next.next) {
                pt1 = pt1.next;
                pt2 = pt2.next.next;
            } else {
                return true;
            }
        }
        return false;

    }
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
