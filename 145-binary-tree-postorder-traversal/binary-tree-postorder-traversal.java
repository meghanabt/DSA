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

    List<Integer> ans =new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        // postOrder(root, ans);
        // return ans;

        // TreeNode curr=root;

        // ArrayList < Integer > postOrder = new ArrayList < > ();
        // if (curr == null) return postOrder;

        // Stack < TreeNode > s1 = new Stack < > ();
        // Stack < TreeNode > s2 = new Stack < > ();
        // s1.push(curr);
        // while (!s1.isEmpty()) {
        //     curr = s1.peek();
        //     s1.pop();
        //     s2.push(curr);
        //     if (curr.left != null)
        //         s1.push(curr.left);
        //     if (curr.right != null)
        //         s1.push(curr.right);
        // }
        // while (!s2.isEmpty()) {
        //     postOrder.add(s2.peek().val);
        //     s2.pop();
        // }
        // return postOrder;


        Stack<TreeNode> st= new Stack<>();
        List<Integer> postOrder= new ArrayList<>();

        while(!st.isEmpty() || root!=null)
        {
            if(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            else
            {
                TreeNode temp=st.peek().right;

                if(temp==null)
                {
                    temp=st.peek();
                    st.pop();
                    postOrder.add(temp.val);

                    while(!st.isEmpty() && temp==st.peek().right)
                    {
                    temp=st.peek();
                    st.pop();
                    postOrder.add(temp.val);

                    }

                }
                else
                {
                   // st.push(temp);
                    root=temp;
                }
            }
        }

        return postOrder;


        
    }

    public static void postOrder(TreeNode root, List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }

        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
}