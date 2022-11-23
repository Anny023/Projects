package Tree;

public class HeightOfTree {
    TreeNode root;
    TreeNode left;
    TreeNode right;
    
    public int maxDepth(TreeNode root){
        if(root==null)
        return 0;

        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        return Math.max(lh,rh)+1;

    }
}
/*

class Solution {
    
    int aux(TreeNode root,boolean[] isBalanced){
        if(root==null)return 0;
        
        int left=aux(root.left,isBalanced);
        int right=aux(root.right,isBalanced);
        
        if(Math.abs(left-right)>1){
            isBalanced[0]=false;
        }
        
        return Math.max(left,right)+1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;    
        }
        
        boolean[] isBalanced=new boolean[1];
        isBalanced[0]=true;
        
        aux(root,isBalanced);
        
        return isBalanced[0];
        
    }
}
 * 
 * 
 * 
 */

 /*
  * class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        
        traverse(root);
        return flag;
        
    }
    
    int traverse(TreeNode root){
        if(root == null)
            return -1;
        
        int left = traverse(root.left);
        int right = traverse(root.right);
        
        if(Math.abs(left - right) > 1)
            flag = false;
        
        return Math.max(left,right) + 1;
    }
}
  */
/*
 * public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        int leftH= findH(root.left);
        int rightH= findH(root.right);
        
        if(Math.abs(leftH- rightH) > 1) return false;
        
        boolean left= isBalanced(root.left);
        boolean right = isBalanced(root.right);
        
        return left&&right;
    }
    
    private int findH( TreeNode root){
        if(root==null) return 0;
        
        int l = findH(root.left);
        int r= findH( root.right);
        
        return 1 + Math.max(l, r);
    }
TC: O(N^2) 
To optimise, we can elimiate checking twice. If left and right at any point return a -1, we wil not check further

public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        if(findH(root)==-1) return false;
        return true;
    }
    
    private int findH( TreeNode root){
        if(root==null) return 0;
        
        int l = findH(root.left);
        if(l==-1) return -1;
        int r= findH( root.right);
        if(r==-1) return -1;
        
        if(Math.abs(l -r ) > 1) return -1;
        
        return 1 + Math.max(l, r);
    }
 */