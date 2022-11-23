package Graph;

public class DfsCode {
    public static int[] visited;

    public static void dfs(ArrayList<ArrayList<Integer>> list,int nodes){

        visited = new int[nodes+1];

        for(int i = 1;i<visited.length;i++){
            if(visited[i]==0){
                helperDfs(list,i);
            }
        }


    }

    private static void helperDfs(ArrayList<ArrayList<Integer>> list, int i) {
        Stack<Integer> st = new Stack<>();
        st.push(i);

        while (!st.isEmpty()){
            int top = st.pop();
            if(visited[top]==0){
                System.out.print(top+" ");
                visited[top] = 1;
                ArrayList<Integer> temp  = list.get(top);
                for(int k:temp){
                    if(visited[k]==0){
                        st.push(k);
                    }
                }
            }

        }
    
    }
}
