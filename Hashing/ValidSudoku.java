package Hashing;

public class ValidSudoku {
    public boolean validBox(char[][] board, int i, int j) {
        for (int column = 0; column < 9; column++) {
            if (column != j && board[i][column] == board[i][j]) {
                return false;
            }
        }

        for (int row = 0; row < 9; row++) {
            if (row != i && board[row][j] == board[i][j]) {
                return false;
            }
        }

        for (int gridi = (i / 3)*3; gridi < (i/3)*3 + 3; gridi++) {
            for (int gridj = (j / 3)*3; gridj < (j/3)*3 + 3; gridj++) {
                if ((gridi != i || gridj != j) && board[gridi][gridj] == board[i][j]) {
                    return false;
                }
            } 
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !validBox(board, i, j)) return false;
            }
        }

        return true;
    }
}
