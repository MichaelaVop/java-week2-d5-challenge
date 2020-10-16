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

            

            board[x][y] = player;

            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }

            winner = checkForWin();
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

    public static char checkForWin() {
        return 'X';

    }

    
}