//EJERCICIO 1
public class ejercicio1 {


    public static void main(String[] args) {
        double a = 5.5;
        double b = 8.2;

        double mayor = obtenerMayor(a, b);
        System.out.println("El mayor valor es: " + mayor);

        int comparacion = compararValores(a, b);
        if (comparacion == 0) {
            System.out.println("Los valores son iguales");
        } else if (comparacion == 1) {
            System.out.println("El primer valor es mayor");
        } else {
            System.out.println("El segundo valor es mayor");
        }

    }

    public static double obtenerMayor(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int compararValores(double x, double y) {
        if (x == y) {
            return 0;
        } else if (x > y) {
            return 1;
        } else {
            return -1;
        }
    }


}
