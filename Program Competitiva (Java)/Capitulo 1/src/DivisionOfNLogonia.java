import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Class to solve UVa 11498
public class DivisionOfNLogonia {
    private static class Coordenates {
        private int x;
        private int y;
        public Coordenates(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public String compareCoordenates(Coordenates coord) {
            if(coord.x == x || coord.y == y) return "divisa";
            else if(coord.x < x && coord.y > y) return "NO";
            else if(coord.x < x) return "SO";
            else if(coord.x > x && coord.y > y) return "NE";
            else return "SE";

        }

        public static void main(String[] args) {
            try {
                File input = new File("NLogoniaInput.txt");
                Scanner myReader = new Scanner(input);
                int n = myReader.nextInt();
                while(n!=0){
                    int xCity = myReader.nextInt();
                    int yCity = myReader.nextInt();
                    Coordenates logoniaCity = new Coordenates(xCity,yCity);
                    for(int i=0; i<n; i++){
                        int a = myReader.nextInt();
                        int b = myReader.nextInt();
                        System.out.println(logoniaCity.compareCoordenates(new Coordenates(a,b)));
                    }
                    n = myReader.nextInt();

                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
