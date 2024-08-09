class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int diff = Integer.MAX_VALUE;

        for(int i=1; i<list.size(); i++){
            int temp = list.get(i)-list.get(i-1);
            diff = Math.min(diff, temp);

        }

        return diff;
    }
}