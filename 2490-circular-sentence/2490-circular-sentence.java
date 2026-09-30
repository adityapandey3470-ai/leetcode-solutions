class Solution {
    public boolean isCircularSentence(String sentence) {
       
       int i = 0;
       int j = sentence.length() - 1;
        if(sentence.charAt(i) != sentence.charAt(j)){
            return false;
        }
        for (int k = 0; k < sentence.length() - 1; k++) {

            if (sentence.charAt(k) == ' ') {

            if (sentence.charAt(k - 1) != sentence.charAt(k +1)) {
                    return false;
                }
            }
        }


        return true;
        
    }
}