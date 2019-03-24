package tree;

/**
 Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
 1
 / \
 2   2
 \   \
 3    3
 Note:
 Bonus points if you could solve it both recursively and iteratively.

 */
public class CheckIfSymetricBinarySearchTree {

    public static void main(String[] args) {
        TreeNode L2_1_L = new TreeNode(27);
        TreeNode L2_1_R = new TreeNode(15);
        TreeNode L2_2_L = new TreeNode(15);
        TreeNode L2_2_R = new TreeNode(27);

        TreeNode L1_L = new TreeNode(20, L2_1_L, L2_1_R);
        TreeNode L1_R = new TreeNode(20, L2_2_L, L2_2_R);

        TreeNode ROOT = new TreeNode(3, L1_L, L1_R);

        boolean result = new CheckIfSymetricBinarySearchTree().isSymmetric(ROOT);

        System.out.println("Output : " + result);

    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}
