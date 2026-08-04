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
        return traverse(root,0);
        
    }

    private int traverse(TreeNode root,int curDepth){
        if(root==null){
            return curDepth;
        }
        curDepth++;
        return Math.max(traverse(root.left,curDepth),traverse(root.right,curDepth));

        
    }
}
