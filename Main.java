import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Dependiente del segundo programa
    public static boolean comprobarPrimo(int a){
        for(int i=2;i<a-1;i++){
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Ej 1
        System.out.println("PRIMER PROGRAMA");
        //Circunferencia 2 * pi * r
        //Area : pi * r^2 (pi * r * r)

        double radio, circunferencia, area;
        radio = 1.0;

        circunferencia = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);


        System.out.println("Area: " + area);

        System.out.println("Circunferencia: " + circunferencia);


        //Ej 2
        //suma de primos
        Scanner sc = new Scanner(System.in);
        int a = 4, b = 4, c;
        System.out.println("SEGUNDO PROGRAMA");
        System.out.println("Elige dos numeros primos para sumarse");
        while (comprobarPrimo(a) == false) {
            System.out.print("Elige el primero: ");
            a = sc.nextInt();
        }
        while (comprobarPrimo(b) == false) {
            System.out.print("Elige el segundo: ");
            b = sc.nextInt();
        }
        c = a + b;
        System.out.println("Resultado de suma: " + c);


        //Ej 3
        //fibonacci
        int max, penul = 0, aux;
        System.out.println("TERCER PROGRAMA");
        System.out.print("Elige un numero como maximo para mostrar la secuencia de Fibonacci: ");
        max = sc.nextInt();
        for (int ultimo = 1; ultimo < max; ) {
            System.out.print(ultimo + " ");
            aux = penul + ultimo;
            penul = ultimo;
            ultimo = aux;
        }

        //Ej4
        //nums en array y devolver suma
        System.out.println("CUARTO PROGRAMA");
        double[] nums = new double[20];
        double res = 0.0;
        int i=0;


        System.out.println("Pon numeros de tipo double y cuando quieras parar pon -1: ");

        while(true){
            double introducido = sc.nextDouble();
            if(introducido==-1) {
                break;
            }
            nums[i] = introducido;
            i++;
            res += introducido;
        };

        System.out.println("El resultado de la suma de todos tus numeros es: " + res);


        //Ej5
        //nums en un array
        System.out.println("QUINTO PROGRAMA");
        ArrayList<Integer> lista = new ArrayList<>();

        while(true){
            String introducido = sc.next();
            if(introducido.equalsIgnoreCase("x")) {
                break;
            }
            try{
                int n = Integer.parseInt(introducido);
                lista.add(n);
            }catch(Exception e){
                System.out.println("Entrada no válida");
            }
        };
        System.out.print("Numeros ingresados: ");
        for(int j=0;j<lista.size();j++){
            System.out.print(lista.get(j));
            if(j<lista.size()-1) {
                System.out.print(", ");
            }
        }

    }
}
