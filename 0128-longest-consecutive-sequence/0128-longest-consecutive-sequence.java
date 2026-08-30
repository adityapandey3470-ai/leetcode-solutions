class Solution {
    public int longestConsecutive(int[] nums) {
         Arrays.sort(nums);
        int count = 0;
        int longest = 0;
        for(int i = 0; i < nums.length; i++){

            if(i > 0 && nums[i] == nums[i - 1] + 1){
                count++;
            }
            else if(i > 0 && nums[i] == nums[i - 1]){
                continue;
                
            }else{
                count = 1;
            }

            longest = Math.max(longest, count);

        }
        return longest;
        
    }
}