class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

     List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length-1-i; j++){

                if(nums[j+1] < nums[j]){

                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;

                }
            }
        }
        for(int k = 0; k < nums.length-2; k++){

            if(k > 0 && nums[k] == nums[k-1]){
                continue;
            }
             int left = k +1;
             int right = nums.length-1;

             while(left < right){
                int sum = nums[k] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[k], nums[left] , nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }

                }


             }
             return ans;
             
            
        }
    }

        
        
    
