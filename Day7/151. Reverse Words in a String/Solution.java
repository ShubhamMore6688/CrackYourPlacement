class Solution {
    public String reverseWords(String s) {
     List<String> words = new ArrayList<>();
     StringBuilder temp = new StringBuilder();
    s = s.trim();
     for(char c: s.toCharArray()){
        if(c != ' '){
            temp.append(c);
        }else if(temp.length() > 0){
            words.add(temp.toString());
            temp.setLength(0);
        }
     }

     if(temp.length() > 0){
        words.add(temp.toString());
     }

     StringBuilder ans = new StringBuilder();

     for(int i=words.size()-1; i>=0; i--){
        ans.append(words.get(i));
        if(i>0){
            ans.append(" ");
        }
     }

     return ans.toString();

    }
}