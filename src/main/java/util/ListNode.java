package util;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/10/18 17:26
 * @Version 1.0
 * @Description
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public List<Integer> display(){
        List<Integer> result =new ArrayList<>();
        ListNode current=this;
        while (current!=null){
            result.add(current.val);
            current=current.next;
        }
        return result;
    }
}
