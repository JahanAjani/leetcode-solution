import java.util.Stack;

public class ReversingLinkList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> store = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            store.push(temp);
            temp = temp.next;
        }
        if (head != null)
            head = store.peek();
        while (!store.empty()) {
            temp = store.pop();
            if (!store.empty()) {
                temp.next = store.peek();
            } else {
                temp.next = null;
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
