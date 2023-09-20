public class Main {
    public static void main(String[] args) {
        //Ej 1
        System.out.println("PRIMER PROGRAMA");
        //Circunferencia 2 * pi * r
        //Area : pi * r^2 (pi * r * r)

        double radio, circunferencia, area;
        radio = 1.0;

        circunferencia = 2*Math.PI*radio;
        area = Math.PI * Math.pow(radio,2);


        System.out.println("Area: " + area);

        System.out.println("Circunferencia: " + circunferencia);
    }
}
