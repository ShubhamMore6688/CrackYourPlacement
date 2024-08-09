class Solution {
    public int leavesSum(TreeNode root, int[] sum, boolean isLeft){
        if(root == null) return sum[0];

        leavesSum(root.left, sum, true);
        if(root.left == null && root.right == null && isLeft){
            sum[0] += root.val;
        }
        leavesSum(root.right, sum, false);

        return sum[0];

    }
    public int sumOfLeftLeaves(TreeNode root) {
        int sum[] = new int[1];
        leavesSum(root, sum, false);
        return sum[0];
    }
}