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
     int BhargavDiff = Integer.MAX_VALUE;
     Integer privesVal = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
        {
            return  BhargavDiff;
        }
        getMinimumDifference(root.left);

        if( privesVal != null)
        {
            BhargavDiff = Math.min(BhargavDiff,root.val-privesVal);
        }
         if(root != null)
         {
             privesVal = root.val;
         }
        getMinimumDifference(root.right);

        return BhargavDiff;
        
    }
}