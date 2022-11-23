/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    public static void main(String[] args){
      //assuming we have root.
       print(root,20);
    }
    private void print(TreeNode root,int x){
        print(root,x,null);
    }
    private void print(TreeNode root,int x,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        if(list==null){
            list = new LinkedList<TreeNode>();
        }
        int sum = 0;
        for(TreeNode tn:list){
            sum+= tn.val;
        }
        if(list.size()==3){
            TreeNode node = list.poll();
            sum-=node.val;
        }
        list.add(root);
        sum+=root.val;
        if(list.size()==3&&sum>=x){
            print(list);
        }else{
            print(root.left,x,list);
            print(root.right,x,list);
        }
        if(list.remove(root)){
            sum-=root.val;
        }
    }
    private void print(LinkedList<TreeNode> list){
        System.out.println("");
        for(TreeNode tn:list){
            System.out.print(tn.val+",");
        }
    }
    
}