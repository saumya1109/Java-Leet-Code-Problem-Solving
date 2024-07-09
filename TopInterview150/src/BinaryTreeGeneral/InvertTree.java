package BinaryTreeGeneral;
public class InvertTree {


    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);


        invertTree(root);


    }

    public static TreeNode invertTree(TreeNode root) {

        //base case
        // root== null ---> null return
        if (root == null) return null;


        // recursive call for left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}