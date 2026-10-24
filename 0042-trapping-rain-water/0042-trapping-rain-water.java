class Solution {
    public int trap(int[] height) {

        int sum = 0;
        int i = 0;
        int j = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int area = 0;

        while(i < j){

            if(height[i] > leftMax){
                leftMax = height[i];
            }

            if(height[j] > rightMax){
                rightMax = height[j];
            }

            if(height[i] < height[j]){
             area = Math.min(leftMax, rightMax) - height[i];
                i++;
            }else{

              area = Math.min(leftMax, rightMax) - height[j];
                j--;
            }
            sum = sum + area;

        }

        return sum;
    }
}