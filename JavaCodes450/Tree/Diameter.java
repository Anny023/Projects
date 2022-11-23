package Tree;

public class Diameter {


    
    public int height(TreeNode root){
        if(root==null)return 0;
        int max=Integer.MIN_VALUE;
        int l=height(root.left);
        int r=height(root.right);
        int d=Math.max(l, r);
        return d;
    }
}
