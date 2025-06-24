import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//UVa problem 00272
public class TEXQuotes {
    public static void main(String[] args) {
        try {
            File input = new File("TEXQuotesInput.txt");
            Scanner myReader = new Scanner(input);
            boolean first = true;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                while(line.contains("\"")){
                    if(first){
                        first = false;
                        line = line.replaceFirst("\"","``");
                    }else{
                        first = true;
                        line = line.replaceFirst("\"","''");
                    }
                }
                System.out.println(line);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
