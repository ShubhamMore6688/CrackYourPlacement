class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp = target - nums[i];

            if(mapp.containsKey(temp)){
                return new int[]{mapp.get(temp), i};
            }

            mapp.put(nums[i], i);

        }

        return new int[]{};
    }
}