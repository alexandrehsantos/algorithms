package bulvee.com.tests.pairThatSumarizeResult;

import java.util.*;
import java.util.stream.IntStream;

public final class SumTwoBruteForce {

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 5, 11 };
        int[] twoSum = SumTwoBruteForce.twoSum(nums, 10);
        IntStream stream = Arrays.stream(twoSum);
        stream.forEach(n -> System.out.println(n));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length >= 2 && nums.length <= 10000) {
            System.out.println(nums + " target:" + target);
            if (target >= (-1000000000) && target <= (1000000000)) {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] >= (-1000000000) && nums[i] <= (1000000000)) {
                        for (int j = 0; j < nums.length; j++) {
                            if ((i != j) && ((nums[i] + nums[j]) == target)) {
                                return new int[] { i, j };
                            }
                        }
                    }
                }
            }
        }
        return new int[] {};
    }
}
