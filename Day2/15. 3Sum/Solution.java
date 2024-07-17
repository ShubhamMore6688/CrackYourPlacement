class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            List<Integer> temp = new ArrayList<>();
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
            if(sum==0){
               set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }else if(sum < 0){
                j++;
            }else{
                k--;
            }
            }

        }
        list.addAll(set);

        return list;
    }
}