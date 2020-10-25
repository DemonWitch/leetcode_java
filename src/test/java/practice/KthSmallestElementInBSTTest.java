package practice;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

/**
 * @Author Richard Lv
 * @Date 2020/10/24 22:22
 * @Version 1.0
 * @Description
 */
public class KthSmallestElementInBSTTest {

    @Test
    public void kthSmallest(){
        Integer[] tree=new Integer[]{3,1,4,null,2};
        TreeNode root=TreeNode.createBinaryTree(tree);

        Assert.assertEquals(1,new KthSmallestElementInBST().kthSmallest(root,1));
    }
}
