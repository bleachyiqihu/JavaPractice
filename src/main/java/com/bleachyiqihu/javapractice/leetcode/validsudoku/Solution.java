package com.bleachyiqihu.javapractice.leetcode.validsudoku;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Paul on 2018-09-14
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Character>> banMap = new HashMap<>();
        for(int i=0;i < 27;i++) {
            banMap.put(i, new LinkedList<>());
        }
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j] == '.')
                    continue;
                List<Character> lineBanList = banMap.getOrDefault(i, new LinkedList<>());
                List<Character> colBanList = banMap.getOrDefault(j+9, new LinkedList<>());
                List<Character> subBoardBanList = banMap.getOrDefault(getSubBoardNo(i, j), new LinkedList<>());
                if(lineBanList.contains(board[i][j]) || colBanList.contains(board[i][j]) || subBoardBanList.contains(board[i][j])) {
                    return false;
                }
                lineBanList.add(board[i][j]);
                colBanList.add(board[i][j]);
                subBoardBanList.add(board[i][j]);
            }
        }
        return true;
    }

    private int getSubBoardNo(int i, int j) {
        if(0<=i && i<=2 && 0<=j && j<=2) {
            return 18;
        }
        if(0<=i && i<=2 && 3<=j && j<=5) {
            return 19;
        }
        if(0<=i && i<=2 && 6<=j && j<=8) {
            return 20;
        }
        if(3<=i && i<=5 && 0<=j && j<=2) {
            return 21;
        }
        if(3<=i && i<=5 && 3<=j && j<=5) {
            return 22;
        }
        if(3<=i && i<=5 && 6<=j && j<=8) {
            return 23;
        }
        if(6<=i && i<=8 && 0<=j && j<=2) {
            return 24;
        }
        if(6<=i && i<=8 && 3<=j && j<=5) {
            return 25;
        }
        if(6<=i && i<=8 && 6<=j && j<=8) {
            return 26;
        }
        return 0;
    }
}
