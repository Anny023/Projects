package Tree;

public class PreOrder {
    /* time copml= O(n) space O(n)
 * Iterative approach 
 * 
 * void preorder(Node t){
 * Stack st;
 * while(t!=null || !isEmpty(st)){
 * if(t!=null){
 * print(t.data);
 * push(st,t);
 * t=t.lchild;
 * }
 * 
 * else{
 * t=pop(st);
 * t=t.rchild;
 * }
 * 
 * }
 * }
 * 
 */

 /* Recursive Time copml= O(n) space O(n)

  public List inorderTraversal(TreeNode root) {
        List ans = new ArrayList<>();
        
         dfs(root, ans);
        
         return ans;
//     }
    
//     private void dfs(TreeNode root, List ans) {
//         if (root == null) return;
           
           ans.add(root.val);
//         dfs(root.left, ans);
//         dfs(root.right, ans);
//     }
  * 
  */
}
/*
 *     1
 *    /
 *    /
 
 * 
 */