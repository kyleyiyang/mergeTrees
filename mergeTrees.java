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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2!=null) {
            t1=t2;
        } else {
            recurion(t1,t2);
        } 
        return t1;
    }
    public void recurion(TreeNode t1,TreeNode t2) {
        if (t1==null && t2!=null) {
            t1=t2;
        } else if (t1!=null && t2!=null) {
            t1.val+=t2.val;
            recurion(t1.left,t2.left);
            recurion(t1.right,t2.right);
            if (t1.left==null && t2.left != null) {
                t1.left = t2.left;
            }
            if (t1.right==null && t2.right != null) {
                t1.right = t2.right;
            }
        }
    }
}
