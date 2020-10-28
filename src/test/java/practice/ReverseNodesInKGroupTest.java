package practice;

import org.junit.Assert;
import org.junit.Test;
import util.data_structure.ListNode;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author Richard Lv
 * @Date 2020/10/18 17:12
 * @Version 1.0
 * @Description
 */
public class ReverseNodesInKGroupTest {
    @Test
    public void reverseKGroup(){
        ListNode oneNode=new ListNode(1);
        ListNode twoNode=new ListNode(2);
        ListNode threeNode=new ListNode(3);
        ListNode fourNode=new ListNode(4);
        ListNode fiveNode=new ListNode(5);

        oneNode.next=twoNode;
        twoNode.next=threeNode;
        threeNode.next=fourNode;
        fourNode.next=fiveNode;

        List<Integer> resultList=new ArrayList<>();
        resultList.add(2);
        resultList.add(1);
        resultList.add(4);
        resultList.add(3);
        resultList.add(5);

        Assert.assertEquals(resultList,new ReverseNodesInKGroup().reverseKGroup(oneNode,2).display());
    }
}
