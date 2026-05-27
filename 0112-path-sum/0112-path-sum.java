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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root,0,targetSum);
        
    }
boolean sum(TreeNode root,int count ,int targetSum){
        if(root==null) return false;
        count=count+root.val;
        if(root.left==null && root.right==null){
            return count==targetSum;
        }
        return sum(root.left,count,targetSum) || sum(root.right,count,targetSum);
    }
}