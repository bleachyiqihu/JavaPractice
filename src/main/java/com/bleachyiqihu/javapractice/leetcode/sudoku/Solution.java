package com.bleachyiqihu.javapractice.leetcode.sudoku;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Paul on 2019-03-02
 */
public class Solution {

    private static final Set<String> VALID_CHAR_LIST = Stream.of("1", "2", "3", "4",
            "5", "6", "7", "8", "9").collect(Collectors.toSet());


    void solveSudoku(char[][] board) {
        List<String>[] rowCandidates = getInitializedCandidateArr();
        List<String>[] colCandidates = getInitializedCandidateArr();
        List<String>[] sudokuCandidates = getInitializedCandidateArr();
        List<List<Integer>> emptyLoc = new LinkedList<>();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] != '.') {
                    rowCandidates[row].remove(String.valueOf(board[row][col]));
                    colCandidates[col].remove(String.valueOf(board[row][col]));
                    sudokuCandidates[subSudokuIndex(row, col)].remove(String.valueOf(board[row][col]));
                } else {
                    List<Integer> loc = new ArrayList<>();
                    loc.add(row);
                    loc.add(col);
                    emptyLoc.add(loc);
                }
            }
        }
        solveSudoku(board, rowCandidates, colCandidates, sudokuCandidates, emptyLoc);
    }

    private boolean solveSudoku(char[][] board, List<String>[] rowCandidates,
                                List<String>[] colCandidates, List<String>[] sudokuCandidates,
                                List<List<Integer>> levelList) {
        if (levelList.isEmpty()) {
            return true;
        } else {
            List<Integer> loc = levelList.get(0);
            int row = loc.get(0);
            int col = loc.get(1);
            if (rowCandidates[row].isEmpty() || colCandidates[col].isEmpty() ||
                    sudokuCandidates[subSudokuIndex(row, col)].isEmpty()) {
                return false;
            } else {
                for(int i=0; i < rowCandidates[row].size(); i++) {
                    board[row][col] = rowCandidates[row].get(i).charAt(0);
                    List<String> rowCandidateList = new ArrayList<>(rowCandidates[row]);
                    List<String> colCandidateList = new ArrayList<>(colCandidates[col]);
                    List<String> sudokuCandidateList = new ArrayList<>(sudokuCandidates[subSudokuIndex(row, col)]);
                    List<List<Integer>> tempLevelList = new ArrayList<>(levelList);
                    rowCandidates[row].remove(String.valueOf(board[row][col]));
                    boolean colRemoveFlag = colCandidates[col].remove(String.valueOf(board[row][col]));
                    boolean sudokuRemoveFlag = sudokuCandidates[subSudokuIndex(row, col)].remove(String.valueOf(board[row][col]));
                    if (colRemoveFlag && sudokuRemoveFlag) {
                        levelList.remove(loc);
                        if (solveSudoku(board, rowCandidates, colCandidates, sudokuCandidates, levelList)) {
                            return true;
                        } else {
                            levelList = tempLevelList;
                            rowCandidates[row] = rowCandidateList;
                            colCandidates[col] = colCandidateList;
                            sudokuCandidates[subSudokuIndex(row, col)] = sudokuCandidateList;
                        }
                    } else {
                        rowCandidates[row] = rowCandidateList;
                        if (colRemoveFlag) {
                            colCandidates[col] = colCandidateList;
                        }
                        if (sudokuRemoveFlag) {
                            sudokuCandidates[subSudokuIndex(row, col)] = sudokuCandidateList;
                        }
                        board[row][col] = '.';
                    }
                }
                return false;
            }
        }
    }


    private int subSudokuIndex(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }

    @SuppressWarnings("unchecked")
    private static List<String>[] getInitializedCandidateArr() {
        return new List[]{
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST),
                new ArrayList(VALID_CHAR_LIST)
        };
    }
}