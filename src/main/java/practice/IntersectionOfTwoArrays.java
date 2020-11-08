package practice;

import java.util.*;

/**
 * @Author Richard Lv
 * @Date 2020/11/2 22:19
 * @Version 1.0
 * @Description leetcode No.349
 * Given two arrays, write a function to compute their intersection.
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 *
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int num1Length= nums1.length;
        int num2Length= nums2.length;
        if (num1Length*num2Length==0) return new int[0];
        int[] result=new int[Math.min(num1Length,num2Length)];
        Map<String,Integer> map=new HashMap<>();
        for (int i : nums1) {
            map.put(i+"",1);
        }
        System.out.println(map);
        int index=-1;
        for (int i : nums2) {
            if (map.containsKey(i+"")){
                int count=map.get(i+"");
                count++;
                map.put(i+"",count);
                if (count==2) result[++index]=i;
            }
        }

        return Arrays.copyOf(result,index+1);
    }
}
