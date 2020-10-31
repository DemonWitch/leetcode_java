package practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/10/31 18:13
 * @Version 1.0
 * @Description
 */
public class RotateLeftStringTest {
    @Test
    public void reverseLeftWords(){
        String s="abcdefg";
        String result="cdefgab";
        Assert.assertEquals(result,new RotateLeftString().reverseLeftWords(s,2));

        s="lrloseumgh";
        result="umghlrlose";
        Assert.assertEquals(result,new RotateLeftString().reverseLeftWords(s,6));
    }
}
