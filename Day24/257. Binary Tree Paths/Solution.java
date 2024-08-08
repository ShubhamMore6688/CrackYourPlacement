class Solution {
    public void treePath(TreeNode root, String path, List<String> answer){
        if(root.left == null && root.right == null){
            answer.add(path + root.val);
        }

        if(root.left != null) treePath(root.left, path+root.val+"->", answer);
        if(root.right != null) treePath(root.right, path+root.val+"->", answer);
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        treePath(root, "", answer);
        return answer;
    }
}