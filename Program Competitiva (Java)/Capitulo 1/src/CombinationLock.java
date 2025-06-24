import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//UVa 10550
public class CombinationLock {
    public static void main(String[] args) {
        try {
            File input = new File("CombinationLockInput.txt");
            Scanner myReader = new Scanner(input);
            while (myReader.hasNextLine()){
                int result = 1080;
                int start = myReader.nextInt();
                int lock1 = myReader.nextInt();
                int lock2 = myReader.nextInt();
                int lock3 = myReader.nextInt();
                if(!(start == 0 && lock1 == 0 && lock2 == 0 && lock3 == 0)){
                    //Turn from start to first number clock-wise
                    result += (start-lock1+40)%40*9;
                    //Turn from lock 1 to lock 2 counter clockwise
                    result += (lock2-lock1+40)%40*9;
                    //Turn from lock 2 to lock 3 clockwise
                    result += (lock2-lock3+40)%40*9;
                    System.out.println(result);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
