class Solution {

    private int[] visited;

    public void dfs(int node, List<List<Integer>>graph){
        visited[node]=1;
        for(int nb : graph.get(node)){
            if(visited[nb]==0){
                dfs(nb,graph);
            }
        }
        
    }
    public int countComponents(int n, int[][] edges) {
         List<List<Integer> > graph =new ArrayList<>();
         visited=new int[n];

         for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
         }

         for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);

         }

        //call the dfs

        int ans=0;

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                ans++;
                dfs(i,graph);
            }
        }

        return ans;





    }

}
