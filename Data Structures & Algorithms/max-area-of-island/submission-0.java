class Solution {

    public int dfs(int row,int col,int[][] grid){
        int[][] directions ={{-1,0},{1,0},{0,-1},{0,1}};

        if(row<0|| row>=grid.length || col<0 || col >=grid[0].length || grid[row][col]==0){
            return 0;
        }
        
        grid[row][col]=0;
        int area=1;
        for(int i=0;i<4;i++){
            int dx=directions[i][0];
            int dy=directions[i][1];
            int X=row+dx;
            int Y=col+dy;
            area=area+dfs(X,Y,grid);
            
            
        }

        return area;

    
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,dfs(i,j,grid));
                }
            }
        }



    return ans;





        
    }
}
