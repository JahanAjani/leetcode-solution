/*
 *Create binary tree from the given string, string can contain '(',')','0-9'.
 * always fill first left node and then right node.
 */

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeFromString {
    public Node create(String s){
        char[] sequence = s.toCharArray();
        Stack<Node> st= new Stack<>();
        Node root = null;
        Node tmp = null;
        try {
            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] != '(' && sequence[i] != ')') {
                    tmp = new Node();
                    tmp.val = Character.getNumericValue(sequence[i]);
                    if (!st.isEmpty()) {
                        Node top = st.peek();
                        if (top.left == null) {
                            top.left = tmp;
                        } else if(top.right==null){
                            //what if sequence is wrong tree will be corrupted.
                            top.right = tmp;
                        } else{
                            throw new Exception("wrong sequence.");
                        }
                    } else if (root == null) {
                        root = tmp;
                    }
                } else if (sequence[i] == '(') {
                    if (tmp != null) {
                        st.push(tmp);
                    }
                } else if (sequence[i] == ')') {
                    tmp = st.pop();
                }
            }
        } catch( Exception e){
            System.out.println("Wrong Sequence");
            return null;
        }
        return root;
    }
    public static void main(String[] args){
        BinaryTreeFromString bts = new BinaryTreeFromString();

        String s = "4(2(3)(4))(6(5))"; //valid sequence
        //String s = "4(2(3)(4))(6))";  //wrong sequence

        Node root = bts.create(s);

        printTree(root);
    }

    private static void printTree(Node root) {
        if(root!=null){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int len = q.size();
                System.out.println();
                for(int i=0; i<len; i++){
                    Node tmp = q.remove();
                    if(tmp!=null) {
                        q.add(tmp.left);
                        q.add(tmp.right);
                        System.out.print(tmp.val);
                    }else {
                        System.out.print("null");
                    }
                }
            }
        }
    }
}
