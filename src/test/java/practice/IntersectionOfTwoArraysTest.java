package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/11/2 22:36
 * @Version 1.0
 * @Description
 */
public class IntersectionOfTwoArraysTest {
    @Test
    public void intersection(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result={2};
        Assert.assertArrayEquals(result,new IntersectionOfTwoArrays().intersection(nums1,nums2));

        nums1 = new int[]{4,9,5};
        nums2 = new int[]{9,4,9,8,4};
        result = new int[]{9,4};
        Assert.assertArrayEquals(result,new IntersectionOfTwoArrays().intersection(nums1,nums2));
    }
}
