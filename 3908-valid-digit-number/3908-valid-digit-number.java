class Solution {
    public boolean validDigit(int n, int x) {
        
        int digit = 0;
        boolean isTrue = false;

        while(n > 9){
            digit = n % 10;
           

            if(digit == x){
                isTrue = true;
            }

            n = n / 10;
             
        }

        return isTrue && n != x;
    }
}