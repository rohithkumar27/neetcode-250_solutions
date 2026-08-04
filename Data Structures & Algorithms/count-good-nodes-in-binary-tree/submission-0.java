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

    //when I am travesitng I need to have the maz(previouse value)<node.val

       

        public int cnt=0;
        public int goodNodes(TreeNode root) {
            dfs(root,root.val);
            return cnt;



        }
        

        public void dfs(TreeNode node,int prev){

            if(node==null){
                return ;
            }

            if(node.val>=prev){
                cnt++;
            }
            
            prev=Math.max(node.val,prev);
            dfs(node.left,prev);
            dfs(node.right,prev);
    
        }



        
    


}
