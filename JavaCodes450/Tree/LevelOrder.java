package Tree;

import java.util.LinkedList;
import java.util.Queue;
// ginfind the height of tree using level order traversal
public class LevelOrder {
    public int maxDepth(TreeNode root) {
		if(root == null) return 0 ;
		Queue<TreeNode> q = new LinkedList<>() ;
		q.add(root) ;
		int ans = 0 ;
		while(!q.isEmpty()) {
			ans ++ ;
			int n = q.size() ;
			for(int i = 0;  i< n ; i++) {
				TreeNode x = q.remove() ;
				if(x.left != null) q.add(x.left) ;
				if(x.right != null) q.add(x.right) ;
			}
		}
        return ans ;
    }
    
}
