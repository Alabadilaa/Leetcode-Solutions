package Hashing;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int len = grid.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                boolean b = true;
                for (int k = 0; k < len; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    count++;
                }
            }
        }

        return count;
    }
}
