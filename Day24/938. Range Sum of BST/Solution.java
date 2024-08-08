class Solution {
    public int rangeSum(TreeNode root, int low, int high, int[] sum){
        if(root == null) return sum[0];

        if(root.val >= low && root.val <= high){
            sum[0] += root.val;
        }
        rangeSum(root.left, low, high, sum);
        rangeSum(root.right, low, high, sum);


        return sum[0];
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum[] = new int[1];
        return rangeSum(root, low, high, sum);
    }
}