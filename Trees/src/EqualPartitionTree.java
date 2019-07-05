import java.util.Stack;

/*
 * Given a binary tree with n nodes,
 * your task is to check if it's possible to
 * partition the tree to two trees which have the equal
 * sum of values after removing exactly one edge on the original tree.
 */
public class EqualPartitionTree {
    private Stack<Integer> st = new Stack<>();

    /**
     * Basic idea is to partition the tree into 2 parts whose sum are equal:
     * i.e total_sum = x+x
     * total_sum = 2x
     * x = total_sum/2
     * so, we need to find the sum of nodes whose value is half the total_sum of all nodes.
     * @param root
     * @return boolean true if such partition possible.
     */
    public boolean isPossible(Node root){

        int total_sum = sum(root);
        if(total_sum % 2==0){
            while(!st.empty()){
                if(st.pop() == total_sum/2){
                    return true;
                }
            }
        }
        return false;
    }

    private int sum(Node root) {
        if(root!=null) {
            st.push(sum(root.left) + sum(root.right) + root.val);
            return st.peek();
        }
        return 0;
    }

    public static void main(String[] args){

        /*
         *          5
         *         / \
         *        10  10
         *           /  \
         *          2    3
         */
        Node root = new Node();
        root.val = 5;
        root.left = new Node();
        root.left.val = 10;
        root.right = new Node();
        root.right.val = 10;
        root.right.left = new Node();
        root.right.left.val = 2;
        root.right.right = new Node();
        root.right.right.val = 3;

        EqualPartitionTree ept = new EqualPartitionTree();
        System.out.println(ept.isPossible(root));
    }
}
