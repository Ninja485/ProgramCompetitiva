import java.util.*;

public class Ejercicio111 {

    private static class Estudiante{
        private int x;
        private int y;

        public Estudiante(int x, int y){
            this.x = x;
            this.y = y;
        }

        public double distancia(Estudiante est){
            return Math.sqrt(Math.pow(est.x - x, 2) + Math.pow(est.y - y, 2));
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null)
                return false;
            if(obj instanceof Estudiante){
                Estudiante est = (Estudiante)obj;
                return est.x == x && est.y == y;
            }else{
                return false;
            }
        }
    }
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        while(n<1 || n>8){
            n = entrada.nextInt();
        }
        Por ahora lo hare de forma bruta hasta que sepa como se implementa entrada salida para estas cosas.No puedo dedicarme
        a crear los casos yo mismo a traves de teclado
        */
        int n = 2;
        Random rand = new Random();
        while (estudiantes.size() < 2*n){
            int x = rand.nextInt(1001);
            int y = rand.nextInt(1001);
            if(!estudiantes.contains(new Estudiante(x, y))){
                estudiantes.add(new Estudiante(x, y));
            }
        }
        System.out.println(efficientSearch());
    }

    public static double backtrackingSearch(){
        return 0;
    }

    public static double efficientSearch(){
        TreeMap<Integer,TreeMap<Integer,Estudiante>> ordenacionCoordenadas = new TreeMap<>();
        for (Estudiante est : estudiantes){
            if (ordenacionCoordenadas.containsKey(est.x)){
                ordenacionCoordenadas.get(est.x).put(est.y, est);
            }else{
                TreeMap<Integer,Estudiante> map = new TreeMap<>();
                map.put(est.y,est);
                ordenacionCoordenadas.put(est.x,map);
            }
        }
        double sum = 0;
        Iterator<TreeMap<Integer, Estudiante>> iterator = ordenacionCoordenadas.values().iterator();
        ArrayList<Estudiante> estudiantesAux = new ArrayList<>();
        while (iterator.hasNext()){
            Iterator<Estudiante> iteradorInterno = iterator.next().values().iterator();
            while (iteradorInterno.hasNext()){
                estudiantesAux.add(iteradorInterno.next());
            }
        }
        Iterator<Estudiante> iteratorAux = estudiantesAux.iterator();
        while (iteratorAux.hasNext()){
            Estudiante est = iteratorAux.next();
            Estudiante est2 = iteratorAux.next();
            sum += est.distancia(est2);
        }
        return sum;
    }
}
