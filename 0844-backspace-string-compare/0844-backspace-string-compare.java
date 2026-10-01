class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack = new Stack<>();
        Stack<Character> ans = new Stack<>();
        for(char ch : s.toCharArray()){

            if(ch == '#'){
             if(!stack.isEmpty()) {
                stack.pop();
             }
            }else {
                stack.push(ch);
            }
        }
         for(char ch : t.toCharArray()){
             if(ch == '#'){
             if(!ans.isEmpty()) {
                ans.pop();
             }
           
            }else {
                ans.push(ch);
            }
         }
       
        return stack.equals(ans);
        
    }
}