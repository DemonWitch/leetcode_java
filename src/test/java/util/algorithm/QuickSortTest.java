package util.algorithm;

import org.junit.Assert;
import org.junit.Test;
import util.algorithm.QuickSort;

/**
 * @Author Richard Lv
 * @Date 2020/10/29 22:51
 * @Version 1.0
 * @Description
 */
public class QuickSortTest {

    @Test
    public void quickSortTest(){
        int[] testArr=new int[]{3,2,8,9,5,7};
        int[] result=new int[]{2,3,5,7,8,9};
        Assert.assertArrayEquals(result, QuickSort.quickSort(testArr));
    }
}
