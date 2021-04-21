package assignment8;

import java.util.LinkedList;

public class Question4 {

    int cnt = 0;
    private int n;
    private int m;
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return cnt;
        }
        n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '1') {
                    //dfs(i, j, grid);
                    bfs(i, j, grid);
                    cnt++;
                }
            }
        return cnt;
    }
    void dfs(int horizon, int vertical, char[][] grid) {

        if (horizon < 0 || vertical < 0 || horizon >= n || vertical >= m || grid[horizon][vertical] == '0') {
            return;
        }

        grid[horizon][vertical] = '0';

        dfs(horizon + 1, vertical, grid);
        dfs(horizon, vertical + 1, grid);
        dfs(horizon - 1, vertical, grid);
        dfs(horizon, vertical - 1, grid);

    }

    int [][] dirs = {{0, 1},{1, 0},{0, -1},{-1, 0}};
    void bfs(int x, int y, char[][] grid) {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] i : dirs) {
                int currX = i[0] + curr[0];
                int currY = i[1] + curr[1];
                if (currX >= 0 && currY >= 0 && currX < n && currY < m && grid[currX][currY] == '1') {
                    queue.offer(new int[]{currX, currY});
                    grid[currX][currY] = '0';
                }
            }
        }
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        int res = question4.numIslands(grid);
        System.out.println(res);
    }


}
