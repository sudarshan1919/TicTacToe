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
            System.out.println("Valid move at (" + row + ", " + col + ")");
        } else {
            System.out.println("Invalid move!");
        }
    }

    // UC4 → Slot to Row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // UC4 → Slot to Column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // UC5 → Validation
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-';
    }
}