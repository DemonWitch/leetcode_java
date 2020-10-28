package practice;

import util.data_structure.ListNode;

/**
 * @Author Richard Lv
 * @Date 2020/10/17 21:40
 * @Version 1.0
 * @Description leetcode No.25
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a
 * multiple of k then left-out nodes, in the end, should remain as it is.
 * Example 1:
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 */

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null||head.next==null||k<2) return head;
        ListNode tailNode=head;
        for (int i = 0; i < k; i++) {
            if (tailNode==null) return head;
            tailNode=tailNode.next;
        }

        ListNode currentNewHead=doReverse(head,tailNode);// 1-2 -> 2-1 返回新的头结点 2

        head.next=reverseKGroup(tailNode,k);//当前方法的head是1,经过翻转,1变成尾部,递归，尾部接上下一次的新头结点

        return currentNewHead;//所有递归返回后，新头结点为2
    }

    private ListNode doReverse(ListNode headNode,ListNode tailNode){
        ListNode preNode=null;
        ListNode nextNode=null;
        while (headNode!=tailNode){
            nextNode=headNode.next;
            headNode.next=preNode;
            preNode=headNode;
            headNode=nextNode;
        }
        return preNode;
    }


}
