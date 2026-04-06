import java.util.*;
public class Main {
    public static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char player = 'X';
        while (true) {
            printBoard();
            playerMove(player);

            if (checkWin(player)) {
                printBoard();
                System.out.println("Player " + player + " wins!");
                break;
            }

            if (checkDraw()) {
                printBoard();
                System.out.println("Game Draw!");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
    }

    public static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }

    static void playerMove(char player) {
        System.out.print("Player " + player + " enter row (0-2) and column (0-2): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        if (board[row][col] == ' ') {
            board[row][col] = player;
        } else {
            System.out.println("Cell already taken! Try again.");
            playerMove(player);
        }
    }

    static boolean checkWin(char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;

            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}

