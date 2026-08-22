class Solution {
    public int alternateDigitSum(int n) {

       int sign = 1;
        int rev = 0;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        while(rev > 0){
            int digit1 = rev % 10;
            sum = sum + digit1 * sign;
            sign = sign * -1;

            rev = rev / 10;
        }
        return sum;
    }
}