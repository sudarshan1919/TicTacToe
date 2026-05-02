public class Main {

    // Create a 3x3 character array
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        Initialize();
        printboard();
    }
    static void Initialize(){
        // Initialize all cells with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }}

    static void printboard(){
        // Print the board
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
