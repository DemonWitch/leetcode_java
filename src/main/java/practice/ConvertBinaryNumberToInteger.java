package practice;

import util.data_structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/11/8 22:36
 * @Version 1.0
 * @Description leetcode No.1290
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 *
 * Return the decimal value of the number in the linked list.
 * Example 1:
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 *
 * Example 2:
 * Input: head = [0]
 * Output: 0
 *
 * Example 3:
 * Input: head = [1]
 * Output: 1
 *
 * Example 4:
 * Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * Output: 18880
 *
 * Example 5:
 * Input: head = [0,0]
 * Output: 0
 */
public class ConvertBinaryNumberToInteger {
    /**
     * 高位到低位的反向运算
     * 10进制也可
     * 最佳答案：
     *         int res = 0;
     *         while(head != null){
     *             res = res * 2 + head.val;//乘2可以换成位移运算：res = res << 1 + head.val
     *             head = head.next;
     *         }
     *         return res;
     *
     */
    public int getDecimalValue(ListNode head) {
        int result=0;
        int position=0;
        List<Integer> nodeList=new ArrayList<>();
        ListNode currentNode=head;
        while (currentNode!=null){
            nodeList.add(currentNode.val);
            currentNode=currentNode.next;
        }
        for (int i = nodeList.size()-1; i >= 0; i--) {
            int currentValue=nodeList.get(i);
            if (currentValue==0){
                result+=0;
            }else{
                result+=getValue(position);
            }
            position++;
        }
        return result;
    }

    private static int getValue(int position){
        if (position==0) return 1;
        return 2*getValue(--position);
    }
}
