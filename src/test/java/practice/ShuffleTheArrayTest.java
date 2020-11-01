package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/11/1 17:40
 * @Version 1.0
 * @Description
 */
public class ShuffleTheArrayTest {
    @Test
    public void shuffle(){
        int[] nums=new int[]{2,5,1,3,4,7};
        int[] result=new int[]{2,3,5,4,1,7};
        int n=3;
        Assert.assertArrayEquals(result,new ShuffleTheArray().shuffle(nums,n));

        nums=new int[]{1,2,3,4,4,3,2,1};
        result=new int[]{1,4,2,3,3,2,4,1};
        n=4;
        Assert.assertArrayEquals(result,new ShuffleTheArray().shuffle(nums,n));
    }
}
