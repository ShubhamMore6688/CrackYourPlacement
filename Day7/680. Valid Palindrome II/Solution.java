class Solution {
    public boolean compare(String s, int l, int r){
        while(l<r){
            char x = s.charAt(l);
            char y = s.charAt(r);

            if(x != y) return false;
            l++;
            r--;
        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            char x = s.charAt(l);
            char y = s.charAt(r);

            if(x!=y) return compare(s, l+1, r) || compare(s, l, r-1);

            l++;
            r--;
        }

        return true;
    }
}