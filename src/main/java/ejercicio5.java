import java.util.Scanner;

import static jdk.internal.org.jline.keymap.KeyMap.display;

public class ejercicio5 {
    private static Scanner scanner = new Scanner(System.in);

    private final int FILAS = 10;
    private final int COLUMNAS = 40;
    private char[][] tablero = new char[FILAS][COLUMNAS];

    public static void main(String[] args) {
        tallerASCII();
    }

    public static void inicializarTablero(char [][] tablero){
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length; j++){
                tablero[i][j] = '-';
            }
        }
    }

    public static void mostrarTablero(char [][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("X ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println(" X");
        }

    }


    public static void dibujarCaracter(char [][] tablero, int fila, int columna, char nuevoCaracter){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == fila && j == columna){
                    tablero[i-1][j-1] = nuevoCaracter;
                }
            }
        }


    }

    public static void dibujarRectangulo(char [][] tablero, int fila, int columna, int ancho, int alto, char nuevoCaracter){
        //dibujar rectangulo con un caracter
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i >= fila && i <= fila + ancho && j >= columna && j <= columna + alto){
                    tablero[i][j] = nuevoCaracter;
                }
            }
        }



    }

    public static void cambiarCaracter(char [][] tablero, char caracterViejo, char caracterNuevo){
        //cambiar un caracter por otro
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length; j++){
                if (tablero[i][j] == caracterViejo){
                    tablero[i][j] = caracterNuevo;
                }
            }
        }

    }


    public static void tallerASCII(){
        char [][] tablero = new char[10][40];
        inicializarTablero(tablero);
        mostrarTablero(tablero);
        boolean repetir = false;
        try{
            do{
                repetir = true;
                System.out.println("Bienvenido al taller de ASCII: \n" +
                        "1. Dibujar un caracter\n" +
                        "2. Dibujar un rectángulo\n" +
                        "3. Cambiar un caracter\n" +
                        "4.Salir" );
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Introduce la fila: ");
                        int fila = scanner.nextInt();
                        System.out.println("Introduce la columna: ");
                        int columna = scanner.nextInt();
                        System.out.println("Introduce el caracter: ");
                        char caracter = scanner.next().charAt(0);
                        dibujarCaracter(tablero, fila, columna, caracter);
                        mostrarTablero(tablero);
                        break;

                    case 2:
                        System.out.println("Introduce la fila: ");
                        int fila2 = scanner.nextInt();
                        System.out.println("Introduce la columna: ");
                        int columna2 = scanner.nextInt();
                        System.out.println("Introduce el ancho: ");
                        int ancho = scanner.nextInt();
                        System.out.println("Introduce el alto: ");
                        int alto = scanner.nextInt();
                        System.out.println("Introduce el caracter: ");
                        char caracter2 = scanner.next().charAt(0);
                        dibujarRectangulo(tablero, fila2, columna2, ancho, alto, caracter2);
                        mostrarTablero(tablero);
                        break;

                    case 3:
                        System.out.println("Introduce el caracter que quieres cambiar: ");
                        char caracterViejo = scanner.next().charAt(0);
                        System.out.println("Introduce el caracter nuevo: ");
                        char caracterNuevo = scanner.next().charAt(0);
                        cambiarCaracter(tablero, caracterViejo, caracterNuevo);
                        mostrarTablero(tablero);
                        break;
                    case 4:
                        System.out.println("¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }

            }while (repetir == true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




}



