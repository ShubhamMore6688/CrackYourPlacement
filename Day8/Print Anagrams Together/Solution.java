
//User function Template for Java

class Solution {
    public boolean anagrams(String s1, String s2){
        
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1, ch2);
            
        
    }
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> ans = new ArrayList<>();
        
        boolean[] used = new boolean[string_list.length];
        for(int i=0; i<string_list.length; i++){
            if(used[i]) continue;
            
            List<String> temp = new ArrayList<>();
            for(int j=i; j<string_list.length; j++){
                if(anagrams(string_list[i], string_list[j])){
                    temp.add(string_list[j]);
                    used[j] = true;
                }
            }
            
            ans.add(temp);
        }
        
        return ans;
    }
}
