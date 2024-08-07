class Solution {
    public boolean isSafe(String s, int k) {
        int n = s.length();
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count == k) {
                    return false;
                }
            } else {
                count = 1;
            }
        }

        return true;
    }
    public String removeDuplicates(String s, int k) {

        int n = s.length();
        int count = 0;

        if(isSafe(s, k)){
            return s;
        }

        Stack<Character> stk = new Stack<>();

        for(int i=0; i<n; i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
                count = 1;
            }else if(!stk.isEmpty() && s.charAt(i)==stk.peek()){
                stk.push(s.charAt(i));
                count++;

                if(count == k){
                    while(count != 0 && !stk.isEmpty()){
                        stk.pop();
                        count--;
                    }

                    count = 1;
                }
            }else{
                count = 1;
                stk.push(s.charAt(i));
            }
        }

        Iterator it = stk.iterator();
        StringBuilder string = new StringBuilder();
        while(it.hasNext()){
            string.append(it.next());
        }


        return removeDuplicates(string.toString(), k);
  
        
    }
}