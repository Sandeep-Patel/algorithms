package tree;

/**
 Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.
 Example 1:

 Input:
 2
 / \
 1   3
 Output: true
 Example 2:

 5
 / \
 1   4
 / \
 3   6
 Output: false
 Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
 is 5 but its right child's value is 4.

 */
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode L2_L = new TreeNode(15);
        TreeNode L2_R = new TreeNode(27);

        TreeNode L1_L = new TreeNode(1);
        TreeNode L1_R = new TreeNode(20, L2_L, L2_R);

        TreeNode ROOT = new TreeNode(3, L1_L, L1_R);

        boolean result = new ValidateBinarySearchTree().isValidBST(ROOT);

        System.out.println("Output : " + result);

    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {

        boolean valid = true;
        if (root == null) {
            return true;
        }

        if (root.val >= max || root.val <= min) {
            valid = false;
        }

        valid = valid && isValidBST(root.left, min, root.val);
        valid = valid && isValidBST(root.right, root.val, max);

        return valid;
    }
}
