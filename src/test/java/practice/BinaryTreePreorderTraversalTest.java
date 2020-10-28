package practice;

import org.junit.Assert;
import org.junit.Test;
import util.data_structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/10/27 23:03
 * @Version 1.0
 * @Description
 */
public class BinaryTreePreorderTraversalTest {
    @Test
    public void preorderTraversal(){
        Integer[] root=new Integer[]{1,null,2,3};
        TreeNode rootNode=TreeNode.createBinaryTree(root);

        List<Integer> result=new ArrayList<>(Arrays.asList(1,2,3));

        Assert.assertEquals(result,new BinaryTreePreorderTraversal().preorderTraversal(rootNode));
    }
}
