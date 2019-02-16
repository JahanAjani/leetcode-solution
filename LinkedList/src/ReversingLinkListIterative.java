/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
 */

public class ReversingLinkListIterative {
    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;
        ListNode temp;

        while(head!=null){
            temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
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
