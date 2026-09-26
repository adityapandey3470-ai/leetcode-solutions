class Solution {
    public String removeStars(String s) {
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < s.length(); i++){

        //     if(s.charAt(i) == '*'){
        //         sb.deleteCharAt(sb.length() - 1);

        //     } else{
        //         sb.append(s.charAt(i));
        //     }
        // }
        // return sb.toString();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}