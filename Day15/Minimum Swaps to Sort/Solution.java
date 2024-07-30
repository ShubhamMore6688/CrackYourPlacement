import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static int minSwaps(int nums[])
    {
        int len = nums.length;

        HashMap<Integer, Integer> mapp = new HashMap<>();

        for(int i=0; i<len; i++){
            mapp.put(nums[i], i);
        }

        Arrays.sort(nums);

        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);
        int ans = 0;


        for(int i=0; i<len; i++){

            if(visited[i] || mapp.get(nums[i])==i){
                continue;
            }

            int j=i, cycle_size = 0;

            while (!visited[j]) {
                visited[j] =true;
                j = mapp.get(nums[j]);
                cycle_size++;
            }

            if(cycle_size > 0){
                ans += cycle_size-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int []nums = {7, 16, 14, 17, 6 ,9 ,5 ,3, 18};

        System.out.println(minSwaps(nums));
    }
}