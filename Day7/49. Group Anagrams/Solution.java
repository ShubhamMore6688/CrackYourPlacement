class Solution {
    public boolean anagrams(String s1, String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            if(used[i]) continue;
            List<String> temp = new ArrayList<>();
            for(int j=i; j<strs.length; j++){
                if(anagrams(strs[i], strs[j])){
                    temp.add(strs[j]);
                    used[j] = true;
                }
            }
            ans.add(temp);
        }

        return ans;
    }
}