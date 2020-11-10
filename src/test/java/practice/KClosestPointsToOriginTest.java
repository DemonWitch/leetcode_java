package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/11/10 22:13
 * @Version 1.0
 * @Description
 */
public class KClosestPointsToOriginTest {
    @Test
    public void kClosest(){
        int[][] points=new int[][]{{3,3},{5,-1},{-2,4}};
        int K=2;
        int[][] result=new int[][]{{3,3},{-2,4}};
        Assert.assertArrayEquals(result,new KClosestPointsToOrigin().kClosest(points,K));

        points=new int[][]{{1,3},{-2,2}};
        K=1;
        result=new int[][]{{-2,2}};
        Assert.assertArrayEquals(result,new KClosestPointsToOrigin().kClosest(points,K));
    }
}
