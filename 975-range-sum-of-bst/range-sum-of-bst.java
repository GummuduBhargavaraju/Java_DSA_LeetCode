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
    int b2B;
    public int rangeSumBST(TreeNode root, int low, int high) {
        b2B = 0;
         Bhargav2B(root,  low, high);
         return b2B;
        
    }
    public void Bhargav2B(TreeNode root, int low, int high)
    {
        if( root == null)
        {
            return;
        }
        if(root.val >= low && root.val <=high)
        {
            b2B +=root.val; 
        }
        Bhargav2B(root.left,  low, high);
         Bhargav2B(root.right,  low, high);
    }
}