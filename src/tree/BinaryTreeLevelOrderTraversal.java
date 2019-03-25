package tree;

import java.util.ArrayList;
import java.util.List;

/**
 Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]

 */
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode L2_L = new TreeNode(15);
        TreeNode L2_R = new TreeNode(27);

        TreeNode L1_L = new TreeNode(1);
        TreeNode L1_R = new TreeNode(20, L2_L, L2_R);

        TreeNode ROOT = new TreeNode(3, L1_L, L1_R);

        List<List<Integer>> result = new BinaryTreeLevelOrderTraversal().levelOrder(ROOT);

        System.out.println("Output : ");
        for(List<Integer> level: result) {
            System.out.print("[");
            for(Integer i : level) {
                System.out.print(i+ " ,");
            }
            System.out.print("]");
            System.out.println();
        }

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
