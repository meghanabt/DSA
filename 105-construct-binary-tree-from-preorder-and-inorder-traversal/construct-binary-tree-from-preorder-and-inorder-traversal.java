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

        // adding the values of inorder indexes in a hashmap
        Map<Integer, Integer> inMap= new HashMap<>();

        for(int i=0; i< inorder.length; i++)
        {
            inMap.put(inorder[i],i);
        }
        
       return  createTree(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1, inMap);

          
    }

    public TreeNode createTree(int[] inorder, int instart, int inend, int[] preorder, int prestart, int preend, Map<Integer, Integer> inMap)
    {
        if(prestart> preend || instart > inend) return null;

        TreeNode root = new TreeNode(preorder[prestart]);

        int inroot= inMap.get(root.val);
        int numsleft= inroot - instart;

       root.left= createTree(inorder, instart, inroot-1, preorder, prestart+1, prestart+numsleft, inMap );
       root.right= createTree(inorder, inroot+1, inend,preorder, prestart+numsleft+1, preend , inMap);
    return root;
    }
}