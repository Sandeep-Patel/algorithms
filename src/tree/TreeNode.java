package tree;

import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    /**
     * Creates Tree,
     * format: {root, l1_l, l1_r, l2_1_l, l2_1_r, l3_1_l, l3_1_r, l3_2_l, l3_2_r,, l3_3_l, l3_3_r, l3_4_l, l3_4_r}
     * <p>
     * (enter null for no
     * enter null
     *
     * @param list
     * @return
     */
    public static TreeNode createTree(List<Integer> list) {
        //TODO:
        return null;
    }

    public static void printList(TreeNode header) {
        //TODO:
    }
}