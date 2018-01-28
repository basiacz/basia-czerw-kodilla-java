package com.kodilla.sudoku.game;

import com.kodilla.sudoku.game.board.Board;
import com.kodilla.sudoku.game.resolve.ResolveBoard;

import java.util.List;
import java.util.Scanner;

public class SudokuGame {
    public static final String QUIT = "Q";
    private Board board = new Board();

    public Board getBoard() {
        return board;
    }

    public void enterUserValues() {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals(QUIT)) {
            System.out.println("Enter value in format XYV (X, Y - 0..8), V - value [type Q to quit]:");
            s = scanner.nextLine();
            if (!s.equals(QUIT)) {
                int x = Integer.parseInt(s.substring(0,1));
                int y = Integer.parseInt(s.substring(1,2));
                int v = Integer.parseInt(s.substring(2,3));
                getBoard().setValue(x, y, v);
                System.out.println(getBoard());
            }
        }
    }

    public void resolveSudoku() {
        ResolveBoard rb = new ResolveBoard();
        //delete from occupied fields
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board.getValue(row, col) != Board.EMPTY) {
                    rb.getRows().get(row).getValues().get(col).clear();
                }
            }
        }
        //delete form columns and rows
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board.getValue(row, col) == Board.EMPTY) {
                    for (int n = 0; n < 9; n++) {
                        int value = board.getValue(row, n);
                        if (value != Board.EMPTY) {
                            rb.getRows().get(row).getValues().get(col).remove(value);
                        }
                        value = board.getValue(n, col);
                        if (value != Board.EMPTY) {
                            rb.getRows().get(row).getValues().get(col).remove(value);
                        }
                    }
                }
            }
        }
        //todo: wpisac wartosci, ktore maja tylko jedna mozliwosc
    }
}