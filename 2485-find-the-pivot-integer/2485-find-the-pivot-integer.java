class Solution {
    public int pivotInteger(int n) {
        
        // int ans = n * (n + 1) / 2;

        // for(int i = 1; i <= n; i++){

        //     if(i * i == ans){
        //         return i;
        //     }
        // }
        // return -1;

        int ans = n * (n + 1) / 2;

        int i = (int) Math.sqrt(ans);

        if(i * i == ans){
            return i;
        }
        return -1;
    }
}