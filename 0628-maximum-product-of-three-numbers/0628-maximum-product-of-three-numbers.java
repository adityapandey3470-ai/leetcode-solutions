class Solution {
    public int maximumProduct(int[] arr) {
        // int product = 1;
        // int max = 0;
        
        // for(int i = 0; i < nums.length; i++){

        //     if(Math.abs(nums[i]) > max){
        //         max = nums[i];
        //     }

        //     product = product * max;

        // }
        // return product;

        Arrays.sort(arr);
        int n = arr.length;
        int option1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int option2 = arr[0] * arr[1] * arr[n - 1];
        
        return Math.max(option1, option2);
    
    }
}