import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Class to solve UVa 11172
public class RelationalOperators {
    public static String relationOperator(int a, int b) {
        if(a<b) return "<";
        else if(a>b) return ">";
        else return "=";
    }
    public static void main(String[] args) {
        try {
            File input = new File("RelationalOperatorsInput.txt");
            Scanner myReader = new Scanner(input);
            int n = myReader.nextInt();
            if(n<15){
                for(int i=0; i<n; i++){
                    int a = myReader.nextInt();
                    int b = myReader.nextInt();
                    System.out.println(relationOperator(a,b));
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
