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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer , Integer> inMap = new HashMap<>();
        for(int i =0; i<inorder.length ; i++)
        {
           inMap.put(inorder[i] , i);   
        } 
        TreeNode root = buildTree(preorder ,0,preorder.length-1,inorder ,0,inorder.length-1,inMap);
        return root;   
    }
    private TreeNode buildTree(int[] preorder, int priStrat , int priEnd,
                               int[] inorder ,int  inStart , int inEnd ,
                                 HashMap<Integer , Integer> inMap ) 
    {
        if(priStrat > priEnd ||  inStart > inEnd)
        {
            return null;
        }
       TreeNode root = new TreeNode(preorder[priStrat]);
      int inRoot = inMap.get(root.val);
      int Leftnum = inRoot - inStart;


      root.left = buildTree( preorder,  priStrat + 1 ,priStrat + Leftnum ,
     inorder ,  inStart  ,  inRoot-1 ,  inMap );

     root.right = buildTree( preorder,  priStrat+ Leftnum  + 1 ,  priEnd,
     inorder ,  inRoot+1 , inEnd ,  inMap );
      
     return root;
    }
    
    
}