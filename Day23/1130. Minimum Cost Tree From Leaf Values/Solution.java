class Solution {
    public int mctFromLeafValues(int[] arr) {
        
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(int value: arr){
            while(!stack.isEmpty() && stack.peek() <= value){
                int mid = stack.pop();

                if(!stack.isEmpty()){
                    result += mid * Math.min(stack.peek(), value);
                }
            }

            stack.push(value);
        }

        while(stack.size() > 1){
            result += stack.pop()*stack.peek();
        }

        return result;

    }
}