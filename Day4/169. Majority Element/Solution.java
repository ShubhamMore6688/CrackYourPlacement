class Solution {
    public int majorityElement(int[] nums) {
        int n  = nums.length;
        int appear = n/2;
        HashMap<Integer, Integer> mapp = new HashMap<>();

        for(int i=0; i<n; i++){
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> mp : mapp.entrySet()){
            if(mp.getValue() > appear){
                return mp.getKey();
            }
        }

        return 0;
    }
}