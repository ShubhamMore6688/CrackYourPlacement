// package Day10.Rabin-Karp Algorithm for Pattern Searching;

public class Solution {
    public static final int PRIME = 101;
    public static double CreateHash(String str){
        double hash = 0;
        for(int i=0; i<str.length(); i++){
            hash += str.charAt(i) * Math.pow(PRIME, i); 
        }
        return hash;
    }

    public static double UpdateHash(double oldHash, char oldChar, char newChar, int patternLength){
        double newHash = 0;

        newHash = (oldHash - oldChar)/PRIME;
        newHash += newChar * Math.pow(PRIME, patternLength - 1);

        return newHash;
    }


    public static void SearchPattern(String text, String pattern){
        int patternLength = pattern.length();
        double pattenHash = CreateHash(pattern);
        double textHash = CreateHash(text.substring(0, patternLength));


        for(int i=0; i<text.length()-patternLength; i++){
            if(textHash == pattenHash){
                if(text.substring(i, i+patternLength).equals(pattern)){
                    System.out.println("pattern found at index"+ i);
                }
            }

            if(i<text.length()-patternLength){
                textHash = UpdateHash(textHash, text.charAt(i), text.charAt(i+patternLength), patternLength);
            }
        }
    }

    public static void main(String[] args) {
        String text = "apporvkunalmohit";
        String pattern = "kunal";

        SearchPattern(text, pattern);    }
}
