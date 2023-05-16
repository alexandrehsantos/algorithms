package bulvee.com.tests.sumarray;

public class SumArrayLowCode {
    public static void main(String[] args) {
        int[] addedArray = runningSum(new int[]{1,2,3,4});
        for(int i =0; i < addedArray.length; i++){
            System.out.println(addedArray[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] added= new int[nums.length];
        if(nums.length > 0 && nums.length <= 1000){
            added[0] = nums[0];
            for(int i = 1; i < nums.length; i++){
                added[i] = nums[i] + added[i -1];
            }
        }
        return added;
    }
}
