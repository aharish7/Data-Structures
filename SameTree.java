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
            return check(p,q);    
    
    }
    public static boolean check(TreeNode p, TreeNode q){    
        if(p!=null && q!=null){
            if(p.val == q.val){
                if(!check(p.left, q.left))
                    return false;
                if(!check(p.right, q.right))
                    return false;                 
            }else
                return false;
        }else if(p!=null)
            return false;
         else if(q!=null)
            return false;
                                                    
        return true;
        
    }

}
