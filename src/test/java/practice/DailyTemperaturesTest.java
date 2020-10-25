package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/10/21 22:12
 * @Version 1.0
 * @Description
 */
public class DailyTemperaturesTest {

    @Test
    public void dailyTemperatures(){
        int[] temperatures=new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] result=new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        Assert.assertArrayEquals(result,new DailyTemperatures().dailyTemperatures(temperatures));
    }
}
