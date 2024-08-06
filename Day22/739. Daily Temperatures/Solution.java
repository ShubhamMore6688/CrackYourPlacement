class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack =new Stack<>();
        int []results = new int[n];

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                results[stack.peek()] = i-stack.pop();
            }

            stack.push(i);
        }

        return results;
        
    }
}