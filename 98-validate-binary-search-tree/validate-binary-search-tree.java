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
    public boolean isValidBST(TreeNode root) {
        LinkedList<Integer> storeValues = new LinkedList<>();

        helper(root , storeValues);
        boolean  validBST = true;
        int preval = storeValues.get(0);
        for(int i = 1; i<storeValues.size();i++)
        {
            if(storeValues.get(i) <= preval)
            {
              validBST = false;
            }
            preval = storeValues.get(i);
        }
        return validBST;

        
    }
    void helper(TreeNode  root ,  LinkedList<Integer> storeValues){
      
      if(root == null)
      {
        return;
      }
      helper(root.left , storeValues );
      storeValues.add(root.val);
      helper(root.right , storeValues );

    }
}