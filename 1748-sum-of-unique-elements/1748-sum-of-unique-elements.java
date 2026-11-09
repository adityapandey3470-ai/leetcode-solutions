class Solution {
    public int sumOfUnique(int[] nums) {
         
        int [] ans = new int[100];
        int k = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            int count = 0;
            for(int j = 0; j < nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }

                if(count == 1){
                  ans[k] = nums[i];
                  k++;
                }
        }
            for(int n = 0; n < k; n++){
                sum = sum + ans[n];
            }
        
        return sum;
    }
}