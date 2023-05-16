package bulvee.com.tests.pairThatSumarizeResult;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class SumTwoUsingMathConcepts {
    public static void main(String[] args) {
        int[] nums = new int[] { 3,2,4 };
        int[] twoSum = SumTwoUsingMathConcepts.twoSum(nums, 6);

        IntStream stream = Arrays.stream(twoSum);
        stream.forEach(n -> System.out.println(n));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length >= 2 && nums.length <= 10000) {
            HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                int x = target - nums[i];
                if (numsMap.get(x) != null) {
                    return new int[] { i, numsMap.get(x) };
                }
                if (numsMap.get(nums[i]) == null) {
                    numsMap.put(nums[i], i);
                }
            }
        }
        return new int[] {};
    }

}
