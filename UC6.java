package org.example;
import java.util.Scanner;
public class Main {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        if (isValidMove(row, col)) {
            placeMove(row, col, 'X');
            System.out.println("Move placed!");

            // print board
            printBoard();
        } else {
            System.out.println("Invalid move!");
        }
    }
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-';
    }
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // extra (for display)
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}