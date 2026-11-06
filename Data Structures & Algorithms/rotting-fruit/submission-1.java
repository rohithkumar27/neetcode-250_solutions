class Solution {
    private int[] dr={-1,0,0,1};
    private int[] dc={0,1,-1,0};
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        //approach:

    // qns:  if there are not rottern we return 0
    // qn : if there are all rotten we reutn 0
    // an: if there are islands or disconnected adnwe cant reach the.     then retun -1

        //to add all the rotten mangoes into the queue and then do a bfs search everytime we findout neifghbours who are fresh we add them and increament our time by one after pulshing them in the queue (the next layer)
        
        // tc :o(v+E)-> o(n2)
        // spc:o(n) auxilary tracker for visisted i can optmise the smae grid to be visisted as -1 if it is vissited 

        int[][] visited =new int[rows][cols] ;
        Queue< int[]> q= new ArrayDeque<>();
        int fresh=0;

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});

                }
                else if (grid[i][j]==1){
                    fresh++;
                    

                }
            }
        }

        if (fresh == 0) return 0;

        int steps=-1;
        while(!q.isEmpty()){
            int size=q.size();
            
            
            
            for(int j=0;j<size;j++){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            visited[r][c]=1;
                for(int i=0;i<4;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];

                    if(nr<0 || nr>=rows || nc<0 || nc>= cols||grid[nr] [nc]==0|| visited[nr][nc]==1){
                        continue;
                    }


                    if(grid[nr][nc]==2){
                        continue;
                    }

                    if(fresh==0){
                        continue;
                    }

                    fresh--;

                    grid[nr][nc]=2;
                    q.offer(new int[ ]{nr,nc});

            }

            }

         steps++;
        
        }

       
    // if all visite return steps or retunr -1
    
    return fresh==0?steps:-1;

        
    }
}
