class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        int sum = 0;
        int result = 0;
        mapp.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(mapp.containsKey(sum-k)){
                result += mapp.get(sum-k);
            }

            mapp.put(sum, mapp.getOrDefault(sum, 0)+1);
        }

        return result;
    }
}