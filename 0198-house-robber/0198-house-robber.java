class Solution {

    static int solve(int nums[], int index, int dp[]){

         if (index >= nums.length) {
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        int include = nums[index] + solve(nums, index + 2, dp);
        int exclude = 0 + solve(nums, index + 1, dp);
        dp[index] = Math.max(include, exclude);

        return dp[index];
    }
    public int rob(int[] nums) {
        int dp [] = new int[nums.length];
        Arrays.fill(dp, - 1);
        int index = 0;
        return solve(nums, index, dp);

    
      
    }
}