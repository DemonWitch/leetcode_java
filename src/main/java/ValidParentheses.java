import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Author Richard Lv
 * @Date 2020/10/8 17:54
 * @Version 1.0
 * @Description leetcode No.20
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1.Open brackets must be closed by the same type of brackets.
 * 2.Open brackets must be closed in the correct order.
 *
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length()%2!=0) return false;
        Map<Character,Character> parentheses=new HashMap<>();
        parentheses.put('(',')');
        parentheses.put('{','}');
        parentheses.put('[',']');

        Deque<Character> stack=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (!stack.isEmpty()){
                if (parentheses.containsKey(stack.peek())&&c==parentheses.get(stack.peek())){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
