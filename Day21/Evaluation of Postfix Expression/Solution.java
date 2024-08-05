class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stk = new Stack<>();
        int n = S.length();
        
        for(int i=0; i<n; i++){
            if(Character.isDigit(S.charAt(i))){
                stk.push(S.charAt(i) - '0');
            }else{
                int ele1 = stk.pop();
                int ele2 = stk.pop();
                
                switch(S.charAt(i)){
                    case '+': stk.push(ele2+ele1);
                    break;
                    
                    case '-': stk.push(ele2-ele1);
                    break;
                    
                    case '*': stk.push(ele2*ele1);
                    break;
                    
                    case '/': stk.push(ele2/ele1);
                    break;
                }
            }
        }
        
        return stk.pop();
    }
}