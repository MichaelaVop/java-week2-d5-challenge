import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        board = new char[3][3];
        initializeBoard();
        printBoard();
        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;
        char player = 'X';
        char winner = ' ';

        while (winner == ' ') {
            System.out.println("Select two numbers 1 to 3: ");
            x = input.nextInt() - 1;
            y = input.nextInt() - 1;

            if (board[x][y] != '-') {
                System.out.println("This is taken. Try again:");
                continue;
            }

            board[x][y] = player;

            
            if (checkForWin()) {
                winner = player;
            } else {
                if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                }
            }

            printBoard();
        }

        System.out.print("The winner is: ");
        System.out.println(winner);
    }

    public static char[][] board;
    public static void initializeBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    board [i][j] = '-';   
                }
            }
        }
    
    public static void printBoard() {
        System.out.println("--------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {

                System.out.print(board[i] [j]);
                System.out.print (" | ");
            }
            System.out.println("");
            System.out.println("--------------");
        }
    }

    public static boolean checkForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][1] == board[i][0] && board[i][2] == board[i][0]) {
                return true;
            } else if (board[0][i] != '-' && board[1][i] == board[0][i] && board[2][i] == board[0][i]) {
                return true;
            } 
        } 
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[2][2] == board[0][0]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[2][0] == board[0][2]) {
            return true;
        }
        return false;
    }

    
}