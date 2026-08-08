class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxArea = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                maxArea = Math.max(maxArea,bfs(grid,i,j,visited));
            }
        }
        return maxArea;
    }


    public int bfs(int[][] grid, int x, int y, boolean[][] visited)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(x<0 || y<0 || x>=m || y>=n || grid[x][y]==0 || visited[x][y]) 
        return 0;
        visited[x][y]=true;
        int size = 1;
        size+=bfs(grid,x,y-1,visited);
        size+=bfs(grid,x,y+1,visited);
        size+=bfs(grid,x-1,y,visited);
        size+=bfs(grid,x+1,y,visited);

        return size;

    }
}
