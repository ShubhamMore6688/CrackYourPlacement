class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> curr = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int no_of_letters = 0;

        for(String word: words){
            if(curr.size()+word.length()+no_of_letters > maxWidth){
                int no_of_spaces = maxWidth-no_of_letters;
                int slots = curr.size()-1 > 0 ? curr.size()-1 : 1;
                for(int i=0; i<no_of_spaces; i++){
                    curr.set( i%slots, curr.get(i%slots)+" " );
                }

                StringBuilder sb = new StringBuilder();
                for(String cur: curr) sb.append(cur);
                result.add(sb.toString());
                curr.clear();
                no_of_letters = 0;
            }
            curr.add(word);
            no_of_letters += word.length();
        }

        StringBuilder lastline = new StringBuilder();

        for(int i=0; i<curr.size(); i++){
            lastline.append(curr.get(i));
            if(i !=  curr.size()-1) lastline.append(" ");
        }

        while(lastline.length() < maxWidth) lastline.append(" ");
        result.add(lastline.toString());


        return result;

    }
}