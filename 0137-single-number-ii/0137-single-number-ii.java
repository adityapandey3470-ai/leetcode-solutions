class Solution {
    public int singleNumber(int[] nums) {

        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            count1 = (count1 ^ num) & ~count2;
            count2 = (count2 ^ num) & ~count1;
        }

        return count1;
    }
}