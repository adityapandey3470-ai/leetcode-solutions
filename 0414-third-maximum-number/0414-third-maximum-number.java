class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
         int count = 1;
         int n = nums.length - 1;
         int max = nums[n];

        for(int i = n - 1; i >= 0 ; i--){

            if(nums[i] != max)
                count++;
               max = nums[i];

               if(count == 3)
                  return max;

        
        }
        return nums[n] ;
    }
}