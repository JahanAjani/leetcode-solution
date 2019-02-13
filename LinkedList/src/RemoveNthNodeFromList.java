import java.util.Stack;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
 */
public class RemoveNthNodeFromList {
    public ListNode removeNthFromEnd1(ListNode head, int n) {

        Stack<ListNode> store = new Stack<>();
        ListNode temp = head;
        while (temp.next != null) {
            store.push(temp);
            temp = temp.next;
        }
        store.push(temp);
        while (n - 1 > 0) {
            store.pop();
            n--;
        }
        if (store.size() >= 2) {
            ListNode nthelement = store.pop();
            ListNode nthplusoneelement = store.pop();
            nthplusoneelement.next = nthelement.next;
        } else {
            head = store.pop().next;
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
