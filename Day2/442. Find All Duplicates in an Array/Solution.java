class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer,Integer> mapp = new HashMap<Integer,Integer>();

        for(int i: nums){
            mapp.put(i, mapp.getOrDefault(i, 0)+1);
            if(mapp.get(i)==2){
                ans.add(i);
            }
        }

        // for(Map.Entry<Integer,Integer> element: mapp.entrySet() ){
        //     if(element.getValue() == 2){
        //         ans.add(element.getKey());
        //     }
        // }

        return ans;
    }
}