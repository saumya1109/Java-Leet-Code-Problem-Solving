package BinaryTreeGeneral;

public class SymmetricTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        //root.right.right = new TreeNode(5);    <---- false
        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(TreeNode root) {

        //base case
        //root== null -- true
        if (root == null) {
            return true;
        }


        // call this for every left subtree or right subtree
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {


        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);


    }
}
