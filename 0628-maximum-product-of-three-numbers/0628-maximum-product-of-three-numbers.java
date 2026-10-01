class Solution {
    public int maximumProduct(int[] nums) {

        int productM = 1;
        int productN = 1; 
        // m = max and n = min.
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){

            if(nums[i] > m1){
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            }
            else if(nums[i] > m2){
                m3 = m2;
                m2 = nums[i];
            }
            else if(nums[i] > m3){
                m3 = nums[i];
            }
           
           if(nums[i] < n1){
            n2 = n1;
            n1 = nums[i];
           }
           else if(nums[i] < n2){
            n2 = nums[i];
           }

            productM = m1 * m2 * m3;
            productN = n1 * n2 * m1;

        }
        return Math.max(productM, productN);

    
    }
}