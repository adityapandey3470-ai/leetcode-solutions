class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum = 0;
        int storeSum = 0;
        int count = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        if(sum / k >= threshold){
            count++;
        }
         

          for(int j = k; j < arr.length; j++){
            sum = sum + arr[j];
            sum = sum - arr[j - k];

           int  storeSumAvg = sum / k;

            if(storeSumAvg >= threshold ){
                count ++;

            }
          }
          return count;
    }
}