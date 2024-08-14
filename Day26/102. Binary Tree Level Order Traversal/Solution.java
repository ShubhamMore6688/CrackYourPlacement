class Solution {
    public void levelOrderTraversal(TreeNode node, int level, List<List<Integer>> list){
        if(node == null) return;

        if(level == list.size()){
            list.add(new ArrayList<>());
        }
        
        list.get(level).add(node.val);

        levelOrderTraversal(node.left, level+1, list);
        levelOrderTraversal(node.right, level+1, list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderTraversal(root, 0, ans);
        return ans;
    }
}