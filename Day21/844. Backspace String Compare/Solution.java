class Solution {
    public boolean backspaceCompare(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();

        Stack<Character> strS = new Stack<>();
        Stack<Character> strT = new Stack<>();

        for(int i=0; i<lenS; i++){
            if(s.charAt(i)=='#'){
                if(!strS.empty()){
                    strS.pop();
                }
            }else{
                strS.push(s.charAt(i));
            }
        }

        for(int i=0; i<lenT; i++){
            if(t.charAt(i)=='#'){
                if(!strT.empty()){
                    strT.pop();
                }
            }else{
                strT.push(t.charAt(i));
            }
        }

        if(strS.size() != strT.size()){
            return false;
        }

        if(strS.size() == 0 && strT.size() == 0) return true;

        while(strS.size() > 0 && strT.size() > 0){
            int ele1 = strS.pop();
            int ele2 = strT.pop();

            if(ele1 != ele2) return false;
        }


        return true;
    }
}