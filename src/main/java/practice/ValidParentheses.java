package practice;

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
 */
public class ValidParentheses {

    /**
     * 首先，构建合法配对括号的key-value map
     * 创建栈
     * 遇到左括号，push入栈，遇到右括号，peek栈顶括号查询map是否与之配对，若配对，pop弹出栈顶括号
     * 完成遍历后，栈中若无元素则输入括号合法，反之不合法
     */
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
                    //可优化1：若push的右括号无法配对栈顶左括号，则该括号后续无论如何也无法将其配对弹出，
                    //最后栈一定不为空，则输入不合法，可直接return false
                    stack.push(c);
                }
            }else{
                //可优化2：当栈为空时，push一个右括号，同上，
                //最后栈一定不为空，则输入不合法，可直接return false
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
