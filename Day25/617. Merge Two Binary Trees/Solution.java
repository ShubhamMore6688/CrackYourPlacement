class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
         
         TreeNode root = null;

        if(root1 != null && root2 != null){
            root = new TreeNode(root1.val+root2.val);
        }else if(root1 != null){
            root = new TreeNode(root1.val);
        }else if(root2 != null){
            root = new TreeNode(root2.val);
        }


        
        root.left = mergeTrees(root1 != null ? root1.left: null, root2 != null ? root2.left:null);
        root.right = mergeTrees(root1 != null ? root1.right: null, root2 != null ? root2.right:null);


        return root;

       
    }
}