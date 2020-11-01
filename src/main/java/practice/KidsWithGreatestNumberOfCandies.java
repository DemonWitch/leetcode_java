package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Richard Lv
 * @Date 2020/11/1 16:58
 * @Version 1.0
 * @Description leetcode No.1431
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 *
 * For each kid check if there is a way to distribute extraCandies among the kids such that
 * he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 *
 * Example 1:
 *
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation:
 * Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number
 * of candies among the kids.
 * Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 * Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
 * Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
 * Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 */
public class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        if (candies.length==0) return result;
        if (candies.length==1) {
            result.add(true);
            return result;
        }
        int max=-1;
        for (int candy : candies) {
            if (candy>max) max=candy;
        }

        for (int candy : candies) {
            result.add(candy+extraCandies>=max);
        }

        return result;
    }
}
