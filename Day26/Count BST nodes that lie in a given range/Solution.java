class Solution
{
    void inOrder(Node root, int[] ans, int l, int h){
        if(root == null) return;
        
        inOrder(root.left, ans, l, h);
        if(root.data >= l && root.data <= h){
            ans[0] += 1;
        }
        inOrder(root.right, ans, l, h);
    }
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        int []ans = new int[1];
        inOrder(root, ans, l, h);
        return ans[0];
    }
}
