import java.util.Stack;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/562/
 */
public class MinStack {

    /**
     * initialize your data structure here.
     */
    Stack<Integer> s1, s2;

    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if (s1.isEmpty()) {
            s1.push(x);
            s2.push(x);
        } else {
            int tmp = s2.peek();
            if (tmp > x) {
                s2.push(x);
            } else {
                s2.push(tmp);
            }
            s1.push(x);
        }

    }

    public void pop() {
        if (!s1.isEmpty()) {
            s2.pop();
            s1.pop();
        }
    }

    public int top() {
        if (!s1.isEmpty()) {
            return s1.peek();
        } else {
            return -1;
        }
    }

    public int getMin() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            return -1;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */