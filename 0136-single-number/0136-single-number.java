class Solution {
    public int singleNumber(int[] nums) {

        int xorSum = 0;
        int n = nums.length;

        for(int num:nums){
            xorSum = xorSum ^ num;
        }
        
        return xorSum;
    }
}