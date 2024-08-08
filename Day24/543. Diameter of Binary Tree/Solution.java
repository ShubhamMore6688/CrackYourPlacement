class Solution {
    public int treeDiameter(TreeNode root, int[] count){

        if(root==null) return 0;

        int lh = treeDiameter(root.left, count);
        int rh = treeDiameter(root.right, count);

        count[0] = Math.max(count[0], lh+rh);

        return 1+Math.max(lh, rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       int[] count = new int[1];
        treeDiameter(root, count);
        return count[0];

    }
}