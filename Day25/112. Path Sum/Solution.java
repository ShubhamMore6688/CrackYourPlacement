class Solution {
    public boolean pathSum(TreeNode root, int targetsum, int[] sum){
        if(root == null) return false;

        sum[0] += root.val;
        if(root.left == null && root.right == null && sum[0]==targetsum){
            return true;
        }

        boolean left = pathSum(root.left, targetsum, sum); 
        boolean right = pathSum(root.right, targetsum, sum);

        sum[0] -= root.val;

        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
      int sum[] = new int[1];
      return pathSum(root, targetSum, sum);

      
    }
}