package practice;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author Richard Lv
 * @Date 2020/10/22 22:31
 * @Version 1.0
 * @Description leetcode No.239
 * You are given an array of integers nums, there is a sliding window of size k which is moving from
 * the very left of the array to the very right. You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 *
 * Return the max sliding window.
 *
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Example 3:
 * Input: nums = [1,-1], k = 1
 * Output: [1,-1]
 *
 * Example 4:
 * Input: nums = [9,11], k = 2
 * Output: [11]
 */
public class SlidingWindowMaximum {

    /**
     * 初始化结果数组，长度为n-k+1
     * 初始化 右指针R
     * 构建一个双端链表，存储遍历数值下标，方便从数组中快速读取值，以及判断当前值下标是否小于右指针位置
     * 1.先遍历到k-1个元素
     * 2.遍历值与链表中尾部值对比，如果小于，从尾部addLast至链表，
     * 3.如果大于，弹出尾部pollLast
     * 4.循环2、3步，链表头始终为最大的值
     * 5.判断当前链表头结点下标是否小于右指针位置，如果小于，poll弹出
     * 6.将头指针最大值加入结果数组
     */
    public int[] maxSlidingWindowNew(int[] nums, int k) {
        if (k * nums.length == 0) return new int[0];
        if (nums.length == 1 || k == 1) return nums;//如果数组长度为1或者窗口长度为1，返回原数组即可

        Deque<Integer> queue=new LinkedList<>();
        int[] result=new int[nums.length-k+1];
        int R=0;

        for (int i = 0; i < nums.length; i++) {
            if (i<k-1){
                addToQueue(queue,i,nums);
            }else{
                R=i-k+1;
                addToQueue(queue,i,nums);
                if (queue.peek()<R){
                    queue.pop();
                }
                result[i-k+1]=nums[queue.peek()];
            }
        }

        return result;
    }

    private void addToQueue(Deque<Integer> queue,int index,int[] nums){
        while (!queue.isEmpty()){
            int current=nums[index];
            if (current>nums[queue.getLast()]){
                queue.pollLast();
            }else{
                break;
            }
        }
        queue.addLast(index);
    }

    /**
     * 时间复杂度 O(k*n)
     * leetcode超时解答
     */
    @Deprecated
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k * nums.length==0) return new int[0];
        if (nums.length==1 || k==1 ) return nums;

        int[] result=new int[nums.length-k+1];
        for (int i = 0; i < nums.length-k+1; i++) {

            int max=Integer.MIN_VALUE;
            for (int j = i; j < i+k; j++) {
                max=Math.max(nums[j],max );
            }
            result[i]=max;
        }
        return result;
    }
}
