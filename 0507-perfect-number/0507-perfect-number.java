class Solution {
    public boolean checkPerfectNumber(int num) {
         
        // int x = 1;
        // int sum = 0;
        // while(num / 2 >= x){
          
        //  if(num % x == 0){
        // sum = sum + x;
        //  } 
        //  x++;
        // }
        // if(sum != num){
        //     return false;
        //  }
        // return true;

        int sum = 0;

        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum == num;
    }
}