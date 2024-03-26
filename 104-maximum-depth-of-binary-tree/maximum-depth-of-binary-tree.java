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
    public int maxDepth(TreeNode root) {

            // int level=0;
            // LinkedList<TreeNode> queue= new LinkedList<>();
            // queue.addLast(root);

            // while(queue.size()>0)
            // {
            //     int size=queue.size();

            //     while(size-- >0)
            //     {
            //         TreeNode node=queue.removeFirst();

            //         if(node.left!=null)
            //         {
            //             queue.addLast(node.left);
            //         }
            //         if(node.right!=null)
            //         {
            //             queue.addLast(node.right);
            //         }

            //     }

            //     level++;
            // }

            // return level;

            if(root==null) return 0;

            int lh=maxDepth(root.left);
            int rh=maxDepth(root.right);

            return 1+ Math.max(lh,rh);






        
    }
}