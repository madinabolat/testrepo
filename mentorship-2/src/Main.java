import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] gameBoard = new int[3][3];
        int counter = 1;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                gameBoard[i][j] = counter;
                counter ++;
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println();
        }
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("enter user Input");
        String userInput = scannerInput.nextLine();
        System.out.println("the user inputted: "+userInput);
        scannerInput.close();
    }
}