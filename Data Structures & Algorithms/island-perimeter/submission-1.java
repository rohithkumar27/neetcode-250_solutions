class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        int perimeter = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {

                if (grid[row][col] == 0) {
                    continue;
                }

                int degree = 0;

                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    boolean validLand =
                        newRow >= 0 &&
                        newRow < rows &&
                        newCol >= 0 &&
                        newCol < columns &&
                        grid[newRow][newCol] == 1;

                    if (validLand) {
                        degree++;
                    }
                }

                perimeter += 4 - degree;
            }
        }

        return perimeter;
    }
}