class Solution {
    public int countElements(int[] nums) {

        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            }

                for(int k = 0; k < nums.length; k++){
                    if(nums[k] > min && nums[k] < max){
                         count++;
                    }
                }
            
        return count;
        
    }
}