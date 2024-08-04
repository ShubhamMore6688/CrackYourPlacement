class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
       int num;
       if(!output.empty()){
        num = output.peek();
        output.pop();
        return num;
       }else{
        while(!input.empty()){
            output.push(input.peek());
            input.pop();
        }
        num = output.peek();
        output.pop();
        return num;
       }
    }
    
    public int peek() {
       int num1;
       if(!output.empty()){
        num1 = output.peek();
        return num1;

       }else{
        while(!input.empty()){
            output.push(input.peek());
            input.pop();
        }
        num1 = output.peek();
        return num1;
       }
    }
    
    public boolean empty() {
        if(input.empty() && output.empty()) return true;
        return false;
    }
}

