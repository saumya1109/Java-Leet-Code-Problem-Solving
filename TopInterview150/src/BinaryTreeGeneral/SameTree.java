package BinaryTreeGeneral;

public class SameTree {
    public static void main(String[] args) {

        TreeNode p = new TreeNode();
        p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);


        TreeNode q = new TreeNode();
        q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p, q));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // Base Case

        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);


    }


}