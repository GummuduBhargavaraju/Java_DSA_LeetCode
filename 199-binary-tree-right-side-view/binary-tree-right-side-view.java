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
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result  = new ArrayList<>();
        if( root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode currentNode = null;
            int size = queue.size();
            for(int i= 0; i<size ; i++)
            {
               currentNode = queue.poll();
               if(currentNode.left != null)
               {
                 queue.add(currentNode.left);
               }
               if(currentNode.right != null) 
               {
                queue.add(currentNode.right);
               }
            }
            result.add(currentNode.val);
        }
        return result;
        
    }
}