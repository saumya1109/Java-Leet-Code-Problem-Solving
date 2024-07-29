package BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDeptOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        //System.out.println(maxDepth(root));
        System.out.println(maxDeptWithQueue(root));


    }

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;

    }

    public static int maxDeptWithQueue(TreeNode root){

        //If there is no elememt in the tree return 0;
       if(root==null){
           return 0;
       }
       //Add the root node to the Queue

        //Queue<--3

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int dept=0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            dept++;

            while (size-- > 0) {
                TreeNode removed = queue.remove();

                if (removed.left != null) {
                    queue.add(removed.left);

                }

                if (removed.right != null) {
                    queue.add(removed.right);
                }
            }
        }

        return dept;

    }
}
