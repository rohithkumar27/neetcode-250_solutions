
class Solution {

    private int[][] dir = {
        {-1, 0}, {1, 0}, {0, 1}, {0, -1}
    };

    public boolean isValidPosition(int[][] heights, int x, int y) {
        return x >= 0 && x < heights.length &&
               y >= 0 && y < heights[0].length;
    }

    public int minimumEffortPath(int[][] heights) {

        int r = heights.length;
        int c = heights[0].length;

        int[][] effort = new int[r][c];

        for (int[] row : effort) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        effort[0][0] = 0;

        shortest(heights, 0, 0, effort);

        return effort[r - 1][c - 1];
    }

    public void shortest(int[][] heights, int x, int y,
                         int[][] effort) {

        Deque<int[]> queue = new ArrayDeque<>();

        queue.addFirst(new int[]{x, y});

        while (!queue.isEmpty()) {

            int[] node = queue.removeLast();

            int row = node[0];
            int col = node[1];

            for (int i = 0; i < 4; i++) {

                int dx = row + dir[i][0];
                int dy = col + dir[i][1];

                if (!isValidPosition(heights, dx, dy)) {
                    continue;
                }

                int currEffort = Math.max(
                    effort[row][col],
                    Math.abs(heights[dx][dy] - heights[row][col])
                );

                if (currEffort < effort[dx][dy]) {

                    effort[dx][dy] = currEffort;

                    queue.addFirst(new int[]{dx, dy});
                }
            }
        }
    }
}
