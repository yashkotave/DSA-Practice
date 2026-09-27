class Solution {

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1') {

                    count++;
                    bfs(grid, i, j);
                }
            }
        }

        return count;
    }

    static void bfs(char[][] grid, int r, int c) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{r, c});
        grid[r][c] = '0';

        int[][] dir = {
            {-1, 0}, {1, 0},
            {0, -1}, {0, 1}
        };

        while (!q.isEmpty()) {

            int[] cell = q.poll();

            for (int[] d : dir) {

                int nr = cell[0] + d[0];
                int nc = cell[1] + d[1];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    grid[nr][nc] == '1') {

                    grid[nr][nc] = '0';
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}