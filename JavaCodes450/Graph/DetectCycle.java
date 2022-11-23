package Graph;
/* first wull check the node is visited or not
 * then will call for bfscycle detecction function
 * then will insert the node into queue
 * and will modify queue like<node,parent>
 * and for starting node<1,-1> -1 bcz starting
 * node will never have parent
 * 
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.StyleSheet;

public class DetectCycle {
    int first;
    int second;
    public DetectCycle(int first,int second){
        this.first=first;
        this.second=second;
    }
}
    class Node{
        static boolean checkedForCycle(ArrayList<ArrayList<Integer>> adj,int s,boolean vis[]){
            Queue<DetectCycle> q=new LinkedList<>();
            q.add(new DetectCycle(s,-1)); // starting node with its parent
            vis[s]=true;
            while(q.isEmpty()){
                int node=q.peek().first;
                int par=q.peek().second;
                q.remove();

                for(Integer it:adj.get(node)){
                    if(vis[it]==false){
                        q.add(new DetectCycle(it, node));
                        vis[it]=true;
                    }
                    else if(par!=it)return true;
                }
            }
            return false;
        }

    
    
    public boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[v+1];
        Arrays.fill(vis,false);

        for(int i=1;i<=v;i++)
            if(vis[i]==false)
            if(checkedForCycle(adj,i,vis))
            return true;

       
        
        return false;
    }
}
