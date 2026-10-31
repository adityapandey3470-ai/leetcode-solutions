class Solution {
    public boolean checkPerfectNumber(int num) {
         
        int x = 1;
        int sum = 0;
        while(num / 2 >= x){
          
         if(num % x == 0){
        sum = sum + x;
         } 
         x++;
        }
        if(sum != num){
            return false;
         }
        return true;
    }
}