

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int i=0;
        
        long diff = Integer.MAX_VALUE;
        
        while(i<=(n-m)){
           
            long tempdiff = (long)(a.get(i+m-1) - a.get(i));
            diff = Math.min(tempdiff, diff);
            i++;
        }
        
        return diff;
        
        
    }
}