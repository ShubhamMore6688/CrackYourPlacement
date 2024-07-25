import java.util.HashMap;

public class Solution {
    public static HashMap<Character, Integer> mapp = new HashMap<>();
    public static void shiftTable(String pattern){
        int patternLength = pattern.length();

        for(int i=0; i<patternLength; i++){
            char currentchar = pattern.charAt(i);
            int maxShift = Math.max(1, patternLength-i-1);
            mapp.put(currentchar, maxShift);
        }
    }    


    public static int SearchPattern(String text, String pattern){
        int textLength = text.length();
        int patternLength = pattern.length();
        int skips = 0;
        for(int i=0; i<textLength-patternLength; i+=skips){
            skips = 0;
            for(int j=patternLength-1; j>=0; j--){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    if(mapp.get(text.charAt(i+j)) != null){
                        skips = mapp.get(text.charAt(i+j));
                        break;
                    }else{
                        skips = patternLength;
                        break;
                    }
                }
            }

            if(skips == 0){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String text = "THIS IS A TEST TEXT";
        String pattern = "TEST";
        shiftTable(pattern);
        System.out.println(SearchPattern(text, pattern));
    }
}
