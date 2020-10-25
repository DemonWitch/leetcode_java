package practice;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/10/24 21:56
 * @Version 1.0
 * @Description leetcode No.230
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *   2
 * Output: 1
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 *
 */
public class KthSmallestElementInBST {
    /**
     * 中序遍历（左->根节点->右）二叉搜索树得到的结果即为升序排列的顺序
     */
    public int kthSmallest(TreeNode root, int k) {
        if (root==null) return -1;
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result.get(k-1);
    }


    private void inorder(TreeNode root,List<Integer> result){
        if (root==null) return;
        inorder(root.left,result);
        result.add(root.val);
        System.out.println(root.val);
        inorder(root.right,result);
    }
}
