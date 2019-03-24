package tree;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its depth = 3.
 */
public class DepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode L1_L = new TreeNode(9);
        TreeNode L2_L = new TreeNode(15);
        TreeNode L4_R = new TreeNode(7);
        TreeNode L3_R = new TreeNode(7, null, L4_R);
        TreeNode L2_R = new TreeNode(7, null, L3_R);
        TreeNode L1_R = new TreeNode(20, L2_L, L2_R);
        TreeNode ROOT = new TreeNode(3, L1_L, L1_R);

        int result = new DepthOfBinaryTree().maxDepth(ROOT);

        System.out.println("Output : " + result);

    }

    public int maxDepth(TreeNode root) {

        if(root == null) {
            return  0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int maxDepth = Math.max(leftDepth, rightDepth);

        return maxDepth+1;
    }
}
