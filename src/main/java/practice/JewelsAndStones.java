package practice;

/**
 * @Author Richard Lv
 * @Date 2020/11/10 22:35
 * @Version 1.0
 * @Description leetcode No.771
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int[] allStones=new int[58];
        for (int i = 0; i < S.length(); i++) {
            allStones[S.charAt(i)-65]+=1;
        }
        int result=0;
        for (int i = 0; i < J.length(); i++) {
            result+=allStones[J.charAt(i)-65];
        }
        return result;
    }
}
