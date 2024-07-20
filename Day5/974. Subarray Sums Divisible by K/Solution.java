class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        int prefixSum = 0;
        mapp.put(0,1);
        for(int i: nums){
            prefixSum += i;

            int mod = prefixSum % k;

            if(mod<0){
                mod += k;
            }

            if(mapp.containsKey(mod)){
                count += mapp.get(mod);
                mapp.put(mod,mapp.get(mod)+1);
            }else{
                mapp.put(mod, 1);
            }
        }

        return count;
    }
}