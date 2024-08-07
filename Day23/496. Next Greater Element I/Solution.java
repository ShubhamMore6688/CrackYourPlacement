class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> mapp = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            for(int j=i; j<nums2.length; j++){
                if(nums2[j] > nums2[i]){
                    mapp.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }

        int ans[] = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            if(mapp.containsKey(nums1[i])){
                ans[i] = mapp.get(nums1[i]);
            }else{
                ans[i] = -1;
            }
        }

        return ans;
    }
}