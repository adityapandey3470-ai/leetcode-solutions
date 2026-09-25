class Solution {
    public int heightChecker(int[] heights) {

        int n = heights.length;
         int count = 0;
        int []result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = heights[i];
        }

        Arrays.sort(heights);

        for(int i = 0; i < n; i++){
          if(result[i] != heights[i]){
             count++;
        }
        }
         return count;
        
    }
}