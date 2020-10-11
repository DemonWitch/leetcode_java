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
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
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
