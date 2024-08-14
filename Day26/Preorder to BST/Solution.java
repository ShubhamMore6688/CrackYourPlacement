static class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        // code here
        Stack<Node> stk = new Stack<>();
        Node root = new Node(pre[0]);
        stk.add(root);
        
        for(int i=1; i<size; i++){
            Node temp = null;
            
            while(!stk.isEmpty() && pre[i] > stk.peek().data){
                temp = stk.pop();
            }
            
            if(temp == null){
                stk.peek().left = new Node(pre[i]);
                stk.add(stk.peek().left);
            }else{
                temp.right = new Node(pre[i]);
                stk.add(temp.right);
            }
        }
        
        return root;
    }
}