package bulvee.com.tests.sumarray;

import java.util.stream.Stream;

public class SumArray {
    public static void main(String[] args) {
        int[] addedArray = runningSum(new int[]{1,2,3,4});
        for(int i =0; i < addedArray.length; i++){
            System.out.println(addedArray[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        int sum =0;
        int[] addedArray = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
            addedArray[i] = sum;
        }
        return addedArray;
    }
}
