import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/10/8 17:58
 * @Version 1.0
 * @Description
 */

public class ValidAnagramTest {
    @Test
    public void isAnagram() {
        Assert.assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
        Assert.assertFalse(new ValidAnagram().isAnagram("anagrab", "nagaram"));
    }
}
