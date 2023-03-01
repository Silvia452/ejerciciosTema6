import java.util.Scanner;

//EJERCICIO 2
public class ejercicio2 {

    private static final int TAMANO_TABLERO = 10;
    private static char[][] tablero;
    public static void main(String[] args) {
        tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
        inicializarTablero();
        mostrarTablero();
        disparar();

    }

    public static void inicializarTablero(){
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tablero[i][j] = '-';
            }
        }

    }

    public static void mostrarTablero(){
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int introducirEnteroEntreLimites(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Introduce un valor entre " + min + " y " + max + ": ");
            valor = scanner.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }

    public static void disparar() {
        int fila = introducirEnteroEntreLimites(0, TAMANO_TABLERO - 1);
        int columna = introducirEnteroEntreLimites(0, TAMANO_TABLERO - 1);
        if (tablero[fila][columna] == 'X') {
            System.out.println("Ya has disparado en esa posición.");
        } else if (tablero[fila][columna] == 'O') {
            System.out.println("¡Hundiste un barco!");
            tablero[fila][columna] = 'X';
        } else {
            System.out.println("Agua.");
            tablero[fila][columna] = 'X';
        }
    }

}
