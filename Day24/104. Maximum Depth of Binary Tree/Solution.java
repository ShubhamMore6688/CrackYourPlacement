class Solution {
    public int depth(TreeNode root){
       if(root == null) return 0;

       int lh = depth(root.left);
       int rh = depth(root.right);

       return 1+Math.max(lh, rh);


    }
    public int maxDepth(TreeNode root) {
       return depth(root);
    }
}