package practice;

import org.junit.Assert;
import org.junit.Test;
import util.data_structure.ListNode;

/**
 * @Author Richard Lv
 * @Date 2020/11/8 22:55
 * @Version 1.0
 * @Description
 */
public class ConvertBinaryNumberToIntegerTest {
    @Test
    public void getDecimalValue(){
        ListNode oneNode=new ListNode(1);
        ListNode twoNode=new ListNode(0);
        ListNode threeNode=new ListNode(1);

        oneNode.next=twoNode;
        twoNode.next=threeNode;

        Assert.assertEquals(5,new ConvertBinaryNumberToInteger().getDecimalValue(oneNode));
    }
}
