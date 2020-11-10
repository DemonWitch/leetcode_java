package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/11/10 23:02
 * @Version 1.0
 * @Description
 */
public class JewelsAndStonesTest {
    @Test
    public void numJewelsInStones(){
        String J = "aA";
        String S = "aAAbbbb";
        int result=3;
        Assert.assertEquals(result,new JewelsAndStones().numJewelsInStones(J,S));

        J = "z";
        S = "ZZ";
        result=0;
        Assert.assertEquals(result,new JewelsAndStones().numJewelsInStones(J,S));
    }
}
