package practice;

import util.data_structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/10/27 22:58
 * @Version 1.0
 * @Description leetcode No.144
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * Example 1:
 * input root [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * output [1,2,3]
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root==null) return result;
        doPreorderTraversal(root,result);
        return result;
    }

    private void doPreorderTraversal(TreeNode root,List<Integer> result){
        if (root!=null){
            result.add(root.val);
            doPreorderTraversal(root.left,result);
            doPreorderTraversal(root.right,result);
        }
    }
}
