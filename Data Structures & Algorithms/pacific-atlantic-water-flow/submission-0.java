class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ret = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isPacific(heights,i,j, new boolean[m][n]) && isAtlantic(heights,i,j, new boolean[m][n]))
                {
                    List<Integer> temp =  new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ret.add(temp);
                }
            }
        }

        return ret;
        
    }

    public boolean isPacific(int[][] heights, int x, int y, boolean[][] visited) {
            int m = heights.length;
            int n = heights[0].length;
            if(x == 0 || y == 0) return true;
            visited[x][y] = true;
            boolean isPacific = false;
            int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
            for(int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && heights[nx][ny] <= heights[x][y]) {
                    if(isPacific(heights, nx, ny, visited)) return true;
                }
            }
            return false;     
    }

    public boolean isAtlantic(int[][] heights, int x, int y, boolean[][] visited) {
            int m = heights.length;
            int n = heights[0].length;
            if(x == m-1 || y == n-1) return true;
            visited[x][y] = true;
            boolean isAtlantic = false;
            int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
            for(int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && heights[nx][ny] <= heights[x][y]) {
                    if(isAtlantic(heights, nx, ny, visited)) return true;
                }
            }
            return false;     
    }
}