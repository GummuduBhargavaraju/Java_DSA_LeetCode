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
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if(nums == null)
        {
            return null;
        }
        return built(nums , 0 , nums.length-1);
        
    }
    public TreeNode built(int[] nums, int start , int end){
        if(start > end)
        {
            return null;
        }

        int maxindex = start;
        for(int i = start+1; i<=end;i++)
        {
            if(nums[i] > nums[maxindex])
            {
                maxindex = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxindex]);

        root.left = built( nums,  start ,maxindex-1);
        root.right = built(nums, maxindex+1 , end);
        return root;
    }
   
   
}