import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Richard Lv
 * @Date 2020/10/11 21:51
 * @Version 1.0
 * @Description
 */
public class ValidParenthesesTest {
    @Test
    public void isValid() {
        ValidParentheses validParentheses=new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
        Assert.assertTrue(validParentheses.isValid("{[]}"));
        Assert.assertTrue(validParentheses.isValid("()"));
        Assert.assertFalse(validParentheses.isValid("("));
        Assert.assertFalse(validParentheses.isValid("(]"));
        Assert.assertFalse(validParentheses.isValid("([)]"));
    }
}
