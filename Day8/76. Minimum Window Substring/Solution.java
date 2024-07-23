class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }

        int[] map = new int[128];
        int count = t.length();

        int start = 0;
        int end = 0;
        int startIndex = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i=0; i<t.length(); i++){
            map[t.charAt(i)]++;
        }

        char[] chs = s.toCharArray();

        while(end < chs.length){
            int current = chs[end];
            end++;
            if(map[current] > 0){
                count--;
            }
            map[current]--;

            while(count == 0){
                if(end-start < minLen){
                    startIndex = start;
                    minLen = end - start;
                }

                int temp = chs[start];
                start++;
                if(map[temp] == 0){
                    count++;
                }
                map[temp]++;
            }
        }

        return minLen == Integer.MAX_VALUE ? new String(): new String(chs, startIndex, minLen);

    }
}