class Solution {
    private boolean isNumeric(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        int n = tokens.length;

        Stack<Integer> stk = new Stack<>();

        for(int i=0; i<n; i++){
            if(isNumeric(tokens[i])){
                stk.push(Integer.parseInt(tokens[i]));
            }else{
                int fno = stk.pop();
                int sno = stk.pop();

                switch(tokens[i]){
                    case "+": stk.push(fno+sno);
                    break;

                    case "-": stk.push(sno-fno);
                    break;

                    case "*": stk.push(fno*sno);
                    break;

                    case "/": stk.push(sno/fno);
                    break;
                            
                }
            }
        }

        return stk.pop();
    }
}