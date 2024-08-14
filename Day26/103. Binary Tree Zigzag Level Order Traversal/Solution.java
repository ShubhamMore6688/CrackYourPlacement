class Solution {
    public void levelOrder(TreeNode root, List<List<Integer>> list, int level){
        if(root == null) return;

        if(level == list.size()){
            list.add(new ArrayList<Integer>());
        }

        if(level % 2 == 0){
            list.get(level).add(root.val);
        }else{
            list.get(level).add(0, root.val);
        }
        levelOrder(root.left, list, level+1);
        levelOrder(root.right, list, level+1);

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(root, ans, 0);
        return ans;
    }
}