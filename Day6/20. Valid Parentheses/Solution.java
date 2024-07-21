class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }else{
                if(stk.empty()) return false;

                char top = stk.pop();
                if(
                    (top == '(' && s.charAt(i)==')') || 
                    (top == '{' && s.charAt(i)=='}') || 
                    (top == '[' && s.charAt(i)==']') 
                    ) continue;
                return false;
            }
        }

      return stk.empty();
    }
}