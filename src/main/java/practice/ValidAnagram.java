package practice;

/**
 * @Author Richard Lv
 * @Date 2020/10/7 20:35
 * @Version 1.0
 * @Description leetcode No.242
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {

    /**
     * 小写字母共26个，创建长度为26的计数数组，下标代表26个字母的位置
     * 以目标字符串长度依次遍历字符，用unicode码计算当前字符在数组中的位置，
     * 遍历s的字符时数组下标位置数值+1，与之对应遍历t时-1，
     * 完成字符串遍历后，遍历计数数组，如果全部值为0，则表示s与t中的各个字符数相同，即为异位词，反之则不是
     */
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;//如果s与t长度不等，必然不是异位词
        int[] counter=new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)-'a']+=1;// 'A' unicode 65
            counter[t.charAt(i)-'a']-=1;
        }
        for (int j : counter) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
