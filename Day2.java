//shuffle array

public class Day2 {
    public static int[] main(int[] nums, int n){
        int[] ans = new int[2*n];

        for(int i=0; i<n; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[n+i];
            
        }
        return ans;

    }
}
