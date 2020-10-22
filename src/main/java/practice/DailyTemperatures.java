package practice;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author Richard Lv
 * @Date 2020/10/21 21:20
 * @Version 1.0
 * @Description leetcode NO.739
 * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
 *
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 *
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 *
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        if (T.length<=1) return new int[]{0};
        Deque<Integer> stack=new LinkedList<>();
        int[] result=new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty()){
                int topIndex=stack.peek();
                if (T[i]>T[topIndex]){
                    result[topIndex]=i-topIndex;
                    stack.pop();
                }else{
                    break;
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            result[stack.pop()]=0;
        }

        return result;
    }
}
