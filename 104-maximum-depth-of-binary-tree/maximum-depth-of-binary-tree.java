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
 *         this.left = left;+
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        Queue <TreeNode> bhargav = new LinkedList<>();
        bhargav.add(root);
        int BhargavNooflevel = 0;
        while(!bhargav.isEmpty())
        {
           int Bhargavlevel = bhargav.size();
           for(int i =0 ;i<Bhargavlevel;i++)
           {
            TreeNode element = bhargav.poll();
            if(element.left != null)
            {
                 bhargav.add(element.left);
            }
            if(element.right != null)
            {
                 bhargav.add(element.right);
            } 
           }
          BhargavNooflevel++;
        } 
       return BhargavNooflevel; 
    }
}