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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> Bhargav = new ArrayList<>();
       Bhargav2B ( root , Bhargav);
       return Bhargav;  
    }
    private void Bhargav2B(TreeNode root , List<Integer> Bhargav)
    {
        if(root != null)
        {
            Bhargav.add(root.val);
            Bhargav2B(root.left ,Bhargav);
            Bhargav2B(root.right ,Bhargav);  
        }   
    }
}