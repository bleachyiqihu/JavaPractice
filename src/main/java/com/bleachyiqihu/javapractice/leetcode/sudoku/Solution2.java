package com.bleachyiqihu.javapractice.leetcode.sudoku;

/**
 * Created by Paul on 2019-03-02
 */
public class Solution2 {
    void solveSudoku(char[][] board) {

        boolean[][] row = new boolean[9][10];
        boolean[][] col = new boolean[9][10];
        boolean[][] suduku = new boolean[9][10];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    row[i][num] = true;
                    col[j][num] = true;
                    suduku[(i / 3) * 3 + j / 3][num] = true;
                }
            }
        }
        dfs(board, row, col, suduku, 0, 0);
    }

    private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] sudoku, int i, int j) {
        while (board[i][j] != '.') {
            if (++j >= 9) {
                i++;
                j = 0;
            }
            if (i >= 9) {
                return true;
            }
        }
        int sudokuIndex = (i / 3) * 3 + j / 3;
        for (int num = 1; num <= 9; num++) {
            if (!row[i][num] && !col[j][num] && !sudoku[sudokuIndex][num]) {
                board[i][j] = (char) (num + '0');
                row[i][num] = true;
                col[j][num] = true;
                sudoku[sudokuIndex][num] = true;
                if(dfs(board, row, col, sudoku, i, j)) {
                    return true;
                } else {
                    board[i][j] = '.';
                    row[i][num] = false;
                    col[j][num] = false;
                    sudoku[sudokuIndex][num] = false;
                }
            }
        }
        return false;
    }
}
