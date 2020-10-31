package practice;

/**
 * @Author Richard Lv
 * @Date 2020/10/31 17:52
 * @Version 1.0
 * @Description leetcode 剑指 Offer 58
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出:"cdefgab"
 * 示例 2：
 *
 * 输入: s = "lrloseumgh", k = 6
 * 输出:"umghlrlose"
 *
 */
public class RotateLeftString {
    public String reverseLeftWords(String s, int n) {
        if (n==0) return s;
        char[] newChars=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (n-i>0){
                newChars[s.length()-n+i]=s.charAt(i);
            }else{
                newChars[i-n]=s.charAt(i);
            }
        }
        return new String(newChars);
    }
}
