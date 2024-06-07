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
    
    int count =0;
    int out=0;
    public int kthSmallest(TreeNode root, int k) {
        recur(root, k);
        return out;
    }
    
    public void recur(TreeNode node, int k){
        if(node.left != null){
            recur(node.left, k);
        }
        count++;
        if(count == k){
            out = node.val;
            return;
        }
        if(node.right != null){
            recur(node.right, k);
        }
    }
}