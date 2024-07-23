class Solution {
    public int calculate(String s) {
        int curr = 0;
        char op = '+';

        char[] ch = s.toCharArray();
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<ch.length; i++){
            if(Character.isDigit(ch[i])){
                curr = curr*10+ch[i] - '0';
            }   

            if(!Character.isDigit(ch[i]) && s.charAt(i) != ' ' || i == s.length()-1 ){
                if(op == '+'){
                    stk.push(curr);
                }else if(op == '-'){
                    stk.push(-curr);
                }else if(op == '*'){
                    stk.push(stk.pop() * curr);
                }else if(op == '/'){
                    stk.push(stk.pop()/curr);
                }

                op = ch[i];
                curr = 0;
            }
        }


        int res = 0;
        while(!stk.empty()){
            res += stk.pop();
        }

        return res;
    }
}