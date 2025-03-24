/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
     HashSet<Integer> seen;
    public FindElements(TreeNode root) {
        seen = new HashSet<>();
        bfs(root);
    }
    
    public boolean find(int target) {
       return seen.contains(target);
    }
    private void bfs(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        root.val =0;
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode currt = queue.remove();
            seen.add(currt.val);
            if(currt.left != null)
            {
               currt.left.val = 2 * currt.val +1;
               queue.add(currt.left);
            }
             if(currt.right != null)
            {
               currt.right.val = 2 * currt.val +2;
               queue.add(currt.right);
            }
        }
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */