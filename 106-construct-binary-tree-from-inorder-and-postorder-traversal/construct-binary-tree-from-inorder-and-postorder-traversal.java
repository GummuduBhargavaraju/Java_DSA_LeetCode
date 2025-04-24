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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length )
        {
            return null;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0;i<inorder.length;i++)
        {
               map.put(inorder[i],i);
        }
            TreeNode root = buildTree( inorder , 0 ,inorder.length-1,postorder,0,postorder.length-1,map);
            return root;
          
    }
    private TreeNode buildTree(int[] inorder, int istart , int iEnd ,
                               int[] postorder, int pstart , int pEnd,
                                 HashMap<Integer , Integer> map)
    {
        if( pstart > pEnd || istart >  iEnd  )
        {
            return null;
        }
        TreeNode root = new  TreeNode(postorder[pEnd]);
        int inroot = map.get(postorder[pEnd]);
        int leftnum = inroot - istart;

        root.left = buildTree(inorder , istart , inroot-1 ,
                               postorder , pstart  , pstart+leftnum-1 , map);
        root.right = buildTree(inorder , inroot+1,iEnd,
                               postorder , pstart+leftnum, pEnd-1 , map);
        return root;
    }



}