package tree;

import java.util.ArrayList;
import java.util.List;

/**
 Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

 Example 1:
 Input:
 1
 / \
 0   2

 L = 1
 R = 2

 Output:
 1
 \
 2
 Example 2:
 Input:
 3
 / \
 0   4
 \
 2
 /
 1

 L = 1
 R = 3

 Output:
 3
 /
 2
 /
 1
 */
public class TestBinaryTreeLevelTrim {

    public static void main(String[] args) {
        TreeNode L2_L = new TreeNode(1);
        TreeNode L2_R = new TreeNode(2, L2_L, null);

        TreeNode L1_L = new TreeNode(0, null, L2_R);
        TreeNode L1_R = new TreeNode(4);

        TreeNode ROOT = new TreeNode(3, L1_L, L1_R);

        TreeNode Root = new TestBinaryTreeLevelTrim().trimBST(ROOT, 1, 3);


    }
    public TreeNode trimBST(TreeNode root, int L, int R) {

        if(root != null && root.val >= L && root.val <=R) {
            trimBST(root.left,L,R);
            trimBST(root.right,L,R);
        } else {
            if(root.left==null) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return root;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        levelOrderRec(list, root, 0);

        return list;

    }


    public void levelOrderRec(List<List<Integer>> list, TreeNode root, int level) {

        if(root ==null) {
            return;
        }

        List<Integer> levelList;
        if(level >= list.size()) {
            levelList = new ArrayList<>();
            levelList.add(root.val);
            list.add(level, levelList);
        } else {
            levelList = list.get(level);
            levelList.add(root.val);
        }

        levelOrderRec(list, root.left, level+1);
        levelOrderRec(list, root.right, level+1);

    }


}
