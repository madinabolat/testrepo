import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printBoard(String[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static String[][] createEmptyBoard(int n){
        String[][] gameBoard = new String[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                gameBoard[i][j] = "-";}
        }
        return gameBoard;
    }
    public static void placeElementHere(String[][] array, String p, int i, int j){
        array[i][j]=p;
        printBoard(array);
    }
    public static String takeUserInput(){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("enter cell position in the format of row-column (Ex.: 1-1 for a cell in row 1, column 1. Rows and columns start from 1");
        String userInput = scannerInput.nextLine();
        //scannerInput.close();
        return(userInput);
    }
    public static void main(String[] args) {
        String[][] gameBoard = createEmptyBoard(3);
        printBoard(gameBoard);
        //placeElementHere(gameBoard, "x", 0,1);
        //placeElementHere(gameBoard, "o", 0,2);
        String position1 = takeUserInput();
        int i1 = Integer.parseInt(String.valueOf(position1.charAt(0)))-1;
        int j1 = Integer.parseInt(String.valueOf(position1.charAt(2)))-1;
        placeElementHere(gameBoard,"x",i1,j1);

        String position2 = takeUserInput();
        int i2 = Integer.parseInt(String.valueOf(position2.charAt(0)))-1;
        int j2 = Integer.parseInt(String.valueOf(position2.charAt(2)))-1;
        placeElementHere(gameBoard,"o",i2,j2);

        //considerations: there is already element there, out of bounds, row / column number invalid

        // combine user input, place position
        //may be new class? class that puts position?



    }
}