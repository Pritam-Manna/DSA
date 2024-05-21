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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkSame(p, q);
    }

    public boolean checkSame(TreeNode p, TreeNode q){
        boolean res;
        if(p==null && q==null){
            return true;
        }else if(p == null && q != null ||  p != null && q == null || p.val != q.val){
            return false;
        }

        res = checkSame(p.left, q.left);
        if(res == false){
            return false;
        }
        res = checkSame(p.right, q.right);
        if(res == false){
            return false;
        }else{
            return true;
        }
    }
}