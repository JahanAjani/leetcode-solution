import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowStore = new HashSet<>();
            Set<Character> colStore = new HashSet<>();
            Set<Character> boxStore = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowStore.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !colStore.add(board[j][i])) {
                    return false;
                }

                int RowIndex = 3 * (i / 3);
                int ColIndex = 3 * (i % 3);
                if (board[RowIndex + j / 3][ColIndex + j % 3] != '.' && !boxStore.add(board[RowIndex + j / 3][ColIndex + j % 3])) {
                    return false;
                }
            }
        }
        return true;

    }
}
