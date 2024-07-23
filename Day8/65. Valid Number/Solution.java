class Solution {
    public boolean isNumber(String s) {
        boolean ex = false;
        boolean dig = false;
        boolean dot = false;
        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);

            if(Character.isDigit(s.charAt(i))){
                dig = true;
            }else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                if(i>0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') return false;
                // ex = true;
            }else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                if(ex || !dig) return false;
                ex = true;
                dig = false;
            }else if(s.charAt(i) == '.'){
                if(dot || ex) return false;
                dot = true;
            }else return false;
            i++;
        }
        return dig;
    }
}