package BinaryTreeGeneral;
public class FlattenTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flattenTree(root);


    }

    public static void flattenTree(TreeNode root) {
        TreeNode current = null;

        //Base Case
        if (root == null) return;

        /*  Processing the right subtree first ensures it gets linked before the left subtree.
      This is important because, in preorder traversal, right subtree nodes should follow left subtree nodes.*/

        flattenTree(root.right);
        flattenTree(root.left);

        root.right = current;   // Set the current node's right to the previous node
        root.left = null;      // Set the current node's left to null
        current = root;         // Update the previous node to the current node


    }


}