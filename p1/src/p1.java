import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class p1 {
    public static void main(String[] args) throws Exception{
        //1 read file
        File inputDirectory = new File("/Users/madinabolat/Documents/GitHub/testrepo/p1/input.txt");
        FileReader inputData = new FileReader(inputDirectory);
        BufferedReader inputText = new BufferedReader(inputData);
        String inputAsString = inputText.readLine();
        System.out.println(inputAsString);
        //2 identify all words in a text, assign a code to each


    }
}
