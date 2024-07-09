package BinaryTreeGeneral;
import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int output = countNodes(root);
        System.out.println(output);


    }

    public static int countNodes(TreeNode root) {

        /* For level order traversal use queue and initialise it by linked list
         * add the root
         * while  queue is not empty
         *   - pop the first element
         *   - add left and right child if they are not null
         * */
        int noOfNodes = 0;
        int height=0;

        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.remove();
            noOfNodes++;

            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return noOfNodes;
    }
}