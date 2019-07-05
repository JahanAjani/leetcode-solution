public class BoundaryOfTree {
    public void printInAntiClockWise(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val);
        printLeftSide(root.left);
        printLeafNodes(root);
        printRightSideReverseOrder(root.right);
        
    }

    private void printRightSideReverseOrder(Node root) {
        if(root!=null){
            if(root.right!=null) {
                printRightSideReverseOrder(root.right);
                System.out.print(root.val);
            }else if(root.left!=null){
                printRightSideReverseOrder(root.left);
                System.out.print(root.val);
            }

        }
    }

    private void printLeafNodes(Node root) {

        if(root!=null){

            if(root.left==null && root.right==null){
                System.out.print(root.val);
            } else{
                printLeafNodes(root.left);
                printLeafNodes(root.right);
            }
        }
    }

    private void printLeftSide(Node node) {
        if(node == null){
            return;
        }
        if(node.left !=null || node.right!=null) {
            System.out.print(node.val);
        }
        if(node.left!=null) {
            printLeftSide(node.left);
        }else if(node.right!=null){
            printLeftSide(node.right);
        }
        
    }

    public static void main(String[] args){
        
        /*
        *       1
        *        \
        *         2
        *        / \
        *       3   4
         */
        Node root = new Node();
        root.val = 1;
        root.right = new Node();
        root.right.val =2;
        root.right.left = new Node();
        root.right.left.val = 3;
        root.right.right = new Node();
        root.right.right.val = 4;
        
        BoundaryOfTree bt = new BoundaryOfTree();
        bt.printInAntiClockWise(root);
        System.out.println();

        /*
         *          1
         *      /       \
         *     2         3
         *    / \       /
         *   4   5     6
         *      / \   / \
         *     7   8 9  10
         *
         */

        Node root1 = new Node();
        root1.val = 1;
        root1.right = new Node();
        root1.right.val =3;
        root1.left = new Node();
        root1.left.val = 2;
        root1.left.left = new Node();
        root1.left.left.val = 4;
        root1.left.right = new Node();
        root1.left.right.val = 5;
        root1.left.right.left = new Node();
        root1.left.right.left.val = 7;
        root1.left.right.right = new Node();
        root1.left.right.right.val = 8;
        root1.right.left = new Node();
        root1.right.left.val = 6;
        root1.right.left.left = new Node();
        root1.right.left.left.val = 9;
        root1.right.left.right = new Node();
        root1.right.left.right.val = 10;
        bt.printInAntiClockWise(root1); //1,2,4,7,8,9,10,6,3

    }

}
