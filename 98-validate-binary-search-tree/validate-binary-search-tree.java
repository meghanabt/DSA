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
        boolean result=bstHelper(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return result;
    }
    public boolean bstHelper(TreeNode root,long min,long max)
    {
        if(root==null)
        {
            return true;
        }
        boolean leftRes=bstHelper(root.left,min,root.val);
        boolean rightRes=bstHelper(root.right,root.val,max);
        return (root.val>min && root.val<max)? leftRes && rightRes:false;
    }
}