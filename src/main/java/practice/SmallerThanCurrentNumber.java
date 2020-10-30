package practice;

import util.algorithm.QuickSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author Richard Lv
 * @Date 2020/10/26 22:26
 * @Version 1.0
 * @Description leetcode No.1365
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 * Example 1:
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 *
 * Example 2:
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 *
 * Example 3:
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 */
public class SmallerThanCurrentNumber {
    /**
     * 创建二维数组记录原数组的值和下标
     * 按值升序排序二维数组（使用java比较器工具，默认快速排序）
     * 读排序后的二维数组，当前下标即为比它小的数的数目，当前值与上次遍历值相等的话做特殊处理
     *
     * 可优化：
     * 计数排序
     * 注意到数组元素的值域为 [0,100][0,100]，所以可以考虑建立一个频次数组 cntcnt ，cnt[i]cnt[i] 表示数字 ii 出现的次数。
     * 那么对于数字 ii 而言，小于它的数目就为 cnt[0...i-1]cnt[0...i−1] 的总和。
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums==null||nums.length==0) return new int[0];
        if (nums.length==1) return new int[]{1};
        int[] result=new int[nums.length];
        int[][] withIndex=new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            withIndex[i][0]=nums[i];
            withIndex[i][1]=i;
        }
        Arrays.sort(withIndex, Comparator.comparingInt(o -> o[0]));

        int preValue=Integer.MIN_VALUE;
        int preIndex=-1;
        for (int i = 0; i < withIndex.length; i++) {
            int currentValue=withIndex[i][0];
            int currentIndex=withIndex[i][1];
            System.out.println(currentValue);
            System.out.println(currentIndex);
            System.out.println("------------------");
            if (currentValue==preValue){
                result[currentIndex]=result[preIndex];
                continue;
            }
            result[currentIndex]=i;
            preValue=currentValue;
            preIndex=currentIndex;
        }
        return result;
    }
}
