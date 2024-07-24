class Solution {
    String[] LESSTHAN20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
    "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
    "Seventeen", "Eighteen", "Nineteen"};

    String []TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", 
    "Eighty", "Ninety"};



    String []THUSAND = {"", "Thousand", "Million", "Billion"};
    public String numberToWords(int num) {
        String ans = new String();
        if(num == 0){
            return "Zero";
        }

        int i=0;
        while(num > 0){
            if(num % 1000 != 0){
                ans = getValue(num%1000)+THUSAND[i]+" "+ans;
            }
            num /= 1000;
            i++;
        }

        return ans.trim();
        
    }

    public String getValue(int num){
        if(num == 0){
            return "";
        }else if(num < 20){
            return LESSTHAN20[num]+" ";
        }else if(num < 100){
            return TENS[num/10]+" "+getValue(num%10);
        }else
            return LESSTHAN20[num/100]+" Hundred "+ getValue(num%100);
    }
}