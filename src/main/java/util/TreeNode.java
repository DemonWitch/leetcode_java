package util;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author Richard Lv
 * @Date 2020/10/24 21:57
 * @Version 1.0
 * @Description Definition for a binary tree node.
 */
 public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right){
         this.val = val;
         this.left = left;
     }

     //[3,1,4,null,2]
    public static TreeNode createBinaryTree(Integer[] treeArray){
        TreeNode root =new TreeNode(treeArray[0]);

        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        TreeNode currentNode=null;
        Integer currentValue=null;
        int i=1;
        while (i< treeArray.length){
            currentNode=queue.poll();
            currentValue=treeArray[i++];
            if (currentValue!=null){
                TreeNode leftChildNode =new TreeNode(currentValue);
                currentNode.left= leftChildNode;
                queue.offer(leftChildNode);
            }

            currentValue=treeArray[i++];
            if (currentValue!=null){
                TreeNode rightChildNode =new TreeNode(currentValue);
                currentNode.right= rightChildNode;
                queue.offer(rightChildNode);
            }
        }

        return root;
    }
 }

