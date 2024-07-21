class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);

        int start = 0;
        int end = strs.length -1;

        for(int i=0; i< Math.min(strs[start].length(), strs[end].length()); i++){
            if(strs[start].charAt(i) != strs[end].charAt(i)){
                return ans.toString();
            }else{
                ans.append(strs[start].charAt(i));
            }
        }

        return ans.toString();
    }
}