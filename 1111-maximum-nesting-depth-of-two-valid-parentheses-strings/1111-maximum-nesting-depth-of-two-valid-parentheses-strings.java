class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int n = seq.length();

        int result[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(seq.charAt(i) == '('){
                count++;
                result[i] = count % 2;
            } else{
                result[i] = count % 2;
                count--;
            }
        }
       return result;
        
    }
}