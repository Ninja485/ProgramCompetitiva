import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//UVa 01124
public class CelebrityJeopardy {
    public static void main(String[] args) {
        try {
            File input = new File("CelebrityJeopardy.txt");
            Scanner myReader = new Scanner(input);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
