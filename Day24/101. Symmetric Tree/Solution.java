class Solution {
    public boolean isSame(TreeNode leftnode, TreeNode rightnode){
        if(leftnode == null && rightnode == null) return true;

        if(leftnode == null || rightnode == null) return false;
        if(leftnode.val != rightnode.val) return false;

        return isSame(leftnode.left, rightnode.right) && isSame(leftnode.right, rightnode.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left, root.right);
    }
}