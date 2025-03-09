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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
         if( root == null)
         {
            return result;
         } 
         Queue <TreeNode> queue = new LinkedList();
         queue.add(root);
         while(!queue.isEmpty())
         {
            int queuesize = queue.size();
            List<Integer> levelof = new ArrayList<>();
            for(int i=0; i<queuesize ; i++)
            {
               TreeNode  currtnode = queue.poll();
                levelof.add(currtnode.val);
               if(currtnode.left != null)
               {
                 queue.add(currtnode.left);
               }
               if(currtnode.right != null)
               {
                 queue.add(currtnode.right);
               }
            }
            result.add(levelof );
         }
        return result;    

        
    }
}