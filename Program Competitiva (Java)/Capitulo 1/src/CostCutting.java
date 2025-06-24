import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Class to solve UVa 11727 problem
public class CostCutting {
    public static void main(String[] args) {
        try {
            File input = new File("CostCuttingInput.txt");
            Scanner myReader = new Scanner(input);
            int n = myReader.nextInt();
            for (int i = 0; i < n; i++) {
                int a = myReader.nextInt();
                int b = myReader.nextInt();
                int c = myReader.nextInt();
                ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a, b, c));
                Collections.sort(list);
                System.out.println("Case "+ (i+1)+":"+list.get(1));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
