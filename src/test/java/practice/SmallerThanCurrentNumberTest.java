package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/10/30 22:34
 * @Version 1.0
 * @Description
 */
public class SmallerThanCurrentNumberTest {

    @Test
    public void smallerNumbersThanCurrent(){
        int[] nums=new int[]{8,1,2,2,3};
        int[] result=new int[]{4,0,1,1,3};

        Assert.assertArrayEquals(result,new SmallerThanCurrentNumber().smallerNumbersThanCurrent(nums));

        nums=new int[]{6,5,4,8};
        result=new int[]{2,1,0,3};
        Assert.assertArrayEquals(result,new SmallerThanCurrentNumber().smallerNumbersThanCurrent(nums));

        nums=new int[]{7,7,7,7};
        result=new int[]{0,0,0,0};
        Assert.assertArrayEquals(result,new SmallerThanCurrentNumber().smallerNumbersThanCurrent(nums));
    }
}
