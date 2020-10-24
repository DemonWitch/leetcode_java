package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/10/22 22:56
 * @Version 1.0
 * @Description
 */
public class SlidingWindowMaximumTest {
    @Test
    public void maxSlidingWindow() {
        int[] input=new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] result=new int[]{3,3,5,5,6,7};

        Assert.assertArrayEquals(new SlidingWindowMaximum().maxSlidingWindowNew(input,k),result);

        input=new int[]{1};
        k=1;
        result=new int[]{1};
        Assert.assertArrayEquals(new SlidingWindowMaximum().maxSlidingWindowNew(input,k),result);

        input=new int[]{9,11};
        k=2;
        result=new int[]{11};
        Assert.assertArrayEquals(new SlidingWindowMaximum().maxSlidingWindowNew(input,k),result);

        input=new int[]{7,2,4};
        k=2;
        result=new int[]{7,4};
        Assert.assertArrayEquals(new SlidingWindowMaximum().maxSlidingWindowNew(input,k),result);
    }
}
