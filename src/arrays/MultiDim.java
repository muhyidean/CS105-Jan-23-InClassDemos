package arrays;

import java.util.Scanner;

public class MultiDim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] board = {
                {"_","_","_"},
                {"_","_","_"},
                {"_","_","_"}};

        printBoard(board);

        System.out.println("Please select a spot: ");
        int r = input.nextInt();
        int c = input.nextInt();

        board[r][c] = "X";

        printBoard(board);


    }

    public static void printBoard(String [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print( " " + board[i][j] + "  | ");
            }
            System.out.println("");
            System.out.println("-----------------------");
        }
    }


}
