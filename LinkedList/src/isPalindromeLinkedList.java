/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/
 */
public class isPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head, temp, newhead = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = head.next;
            head.next = newhead;
            newhead = head;
            head = temp;


        }
        if (fast != null) {
            head = head.next;
        }
        while (head != null) {
            if (newhead.val != head.val) {
                return false;
            } else {
                newhead = newhead.next;
                head = head.next;
            }
        }
        return true;

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
