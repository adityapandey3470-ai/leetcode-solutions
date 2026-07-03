class Solution {
    public char findTheDifference(String s, String t) {

        int xor = 0;

        for(char ch : s.toCharArray()){
            xor = xor ^ ch;
        }

        for(char ch2 : t.toCharArray()){
            xor = xor ^ ch2;
        }

        return (char) xor;
    }
}