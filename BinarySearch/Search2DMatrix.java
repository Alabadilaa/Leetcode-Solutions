package BinarySearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int columns = matrix[0].length;
        if (columns == 0) return false;

        int row = 0;
        int col = 0;

        while (row < rows && col < columns) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                col++;
                if (col == columns) {
                    col = 0;
                    row++;
                }
            } else {
                return false;
            }
        }

        return false;
    }
}
