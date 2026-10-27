class Solution {
    public String removeKdigits(String num, int k) {
        // StringBuilder s = new StringBuilder();

        // for(int i = 0; i < num.length(); i++){

        //     char ch = num.charAt(i);
        //     while(k > 0 && s.length() > 0 && s.charAt(s.length() - 1) > ch){

        //         s.deleteCharAt(s.length() - 1);
        //         k--;
        //     }

        //     s.append(ch);
        // }

        // for(int i = s.length() - 1; i >= 0 && k > 0; i--){
        //     s.deleteCharAt(i);
        //     k--;
        // }

        // int i  = 0;
        // while(i < s.length() && s.charAt(i) == '0'){
        //     i++;
        // }

        // s = new StringBuilder(s.substring(i));

        // return s.length() == 0 ? "0" : s.toString();

         Stack<Character> stack = new Stack<>();

         for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
         

         while(!stack.isEmpty() && k > 0 && stack.peek() > ch ){
            stack.pop();
            k--;
         }

         stack.push(ch);

    }
        while(k > 0){
            stack.pop();
            k--;
        }

         StringBuilder sb = new StringBuilder();

         for(char ch : stack){
            sb.append(ch);
         }

         while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
         }
             
             if(sb.length() == 0){
                return "0";
             }


    return sb.toString();
}
}