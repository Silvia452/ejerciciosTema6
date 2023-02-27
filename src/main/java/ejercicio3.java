//EJERCICIO 3
public class ejercicio3 {

    public static void main(String[] args) {
        tablas();

    }

    public static void tablas(){
        //Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.
        //
        //Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).
        //
        //Escriba un algoritmo que llame a estas dos funciones.

        int[] tabla = new int[10];
        int min = 0;
        int max = 100;
        int mayor = 0;
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(tabla[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        System.out.println("El mayor valor es: " + mayor);

    }

}
