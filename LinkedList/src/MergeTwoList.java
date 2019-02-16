/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/771/
 */

public class MergeTwoList {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = null, temp, temp1 = null;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            if (temp1 != null) {
                temp1.next = temp;
            }
            if (head == null) {
                head = temp;
            }
            temp1 = temp;
            temp = temp.next;
        }

        if (l1 == null) {
            while (l2 != null) {
                temp = new ListNode(l2.val);
                if (temp1 != null) {
                    temp1.next = temp;
                }
                if (head == null) {
                    head = temp;
                }
                temp1 = temp;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l2 == null) {
            while (l1 != null) {
                temp = new ListNode(l1.val);
                if (temp1 != null) {
                    temp1.next = temp;
                }
                if (head == null) {
                    head = temp;
                }
                temp1 = temp;
                temp = temp.next;
                l1 = l1.next;
            }
        }
        return head;
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
