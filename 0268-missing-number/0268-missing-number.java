class Solution {
    public int missingNumber(int[] nums) {

   /*     int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
        }

        return expectedSum - actualSum; */

        // By XOR 
        int n = nums.length;
        int xorSum = 0;
        for(int num: nums){
            xorSum = xorSum ^ num;
        }
        for(int i = 0; i <= n; i++){
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
}