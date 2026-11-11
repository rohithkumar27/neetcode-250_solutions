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
    private PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
    public int kthSmallest(TreeNode root, int k) {
        // o(k)
        //o(logk)
        dfs(root,k);
        return pq.peek();
        // my approach is to travers in inorder travels addaeelemtin a maxheap and whenheap size hit k prick the element out the heap
        
        //proprity queuw
        //traverse the bfs and add it in priroty ques
    }

    private void dfs(TreeNode root,int k){
        if(root==null){
        return ;
        }
        

        dfs(root.left,k);
        if(pq.size()==k){
            return ;
        }
        else{
        pq.offer(root.val);
        }
        dfs(root.right,k);

    }

}
