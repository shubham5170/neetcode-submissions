class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int islands = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(bfs(grid,i,j,visited))
                islands++;
            }
        }
        return islands;
    }

    public boolean bfs(char[][] grid, int x, int y, boolean[][] visited)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(x<0 || y<0 || x>=m || y>=n || grid[x][y]=='0' || visited[x][y]) 
        return false;
        visited[x][y]=true;
        bfs(grid,x,y-1,visited);
        bfs(grid,x,y+1,visited);
        bfs(grid,x-1,y,visited);
        bfs(grid,x+1,y,visited);

        return true;

    }
}
