class Solution {
    public int maxProduct(int n) {

        int largest = 0;
        int secondLargest = 0;

        while(n > 0) {
            int digit = n % 10;
             n = n / 10;

             if(digit > largest){
                secondLargest = largest;
                largest = digit;
             } else {
                secondLargest = Math.max(secondLargest, digit);
             }
        }
       return largest * secondLargest;
    }
}