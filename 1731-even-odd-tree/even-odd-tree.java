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
    public boolean isEvenOddTree(TreeNode root) {
        HashMap<Integer, Integer> levels = new HashMap();
        return checkEvenOdd(root, levels, 0);
    }
    
    public boolean checkEvenOdd(TreeNode root, HashMap<Integer, Integer> levels, int level){
        if(root == null) return true;
        if(root.val%2==level%2) return false;
        if(levels.containsKey(level)){
            if(level%2==0 && levels.get(level)>=root.val){
                return false;
            } else if(level%2 == 1 && levels.get(level)<=root.val){
                return false;
            }
        }
        levels.put(level, root.val);           
        return checkEvenOdd(root.left, levels, level+1) && checkEvenOdd(root.right, levels, level+1);
    }
}