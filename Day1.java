import java.util.Arrays;


public class Day1{
    public static void main(String[] args){
        int[] nums = new int[5];
        //new ans array creation with new length
        int[] ans = new int[2*nums.length];
        
        //method 1
        //array concatenation - step 1
        System.arraycopy(nums, 0,ans,0,nums.length);
        //array concatenation - step 2
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        //Print ans array
        System.out.println(Arrays.toString(ans));

        //method 2

        for(int i=0; i<ans.length;i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i-nums.length];
            }

        }

        //method 3 - best answer for this

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

    }
}