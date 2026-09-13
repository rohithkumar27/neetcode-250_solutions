class Solution {

    public void dfs(char[][] grid ,int x,int y,int[][]visited){
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        visited[x][y]=1;
        for(int i=0;i<4;i++){
            int dx=x+dir[i][0];
            int dy=y+dir[i][1];
            if(isValid(dx,dy,grid) && visited[dx][dy]==0){
                dfs(grid,dx,dy,visited);
            }
            
        }
    }

    public boolean isValid(int x,int y,char[][] grid){
        return x>=0 && x<grid.length && y>=0 && y < grid[0].length && grid[x][y]=='1';
    }

    public int numIslands(char[][] grid) {
        int[][] visited= new int[grid.length]     [grid[0].length];
        int ans=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
             
                if(visited[i][j]==0 && grid[i][j]=='1'){
                ans++;
                dfs(grid,i,j,visited);
                }

            }

        }

        return ans;

    
        
    }
}
