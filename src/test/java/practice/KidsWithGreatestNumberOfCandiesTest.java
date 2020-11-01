package practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/11/1 17:08
 * @Version 1.0
 * @Description
 */
public class KidsWithGreatestNumberOfCandiesTest {
    @Test
    public void kidsWithCandies(){
        List<Boolean> result =new ArrayList<>(Arrays.asList(true,true,true,false,true));
        int[] candies=new int[]{2,3,5,1,3};
        int extraCandies=3;
        Assert.assertEquals(result,new KidsWithGreatestNumberOfCandies().kidsWithCandies(candies,extraCandies));

        result =new ArrayList<>(Arrays.asList(true,false,false,false,false));
        candies=new int[]{4,2,1,1,2};
        extraCandies=1;
        Assert.assertEquals(result,new KidsWithGreatestNumberOfCandies().kidsWithCandies(candies,extraCandies));
    }
}
