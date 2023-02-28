import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ovejas();

    }

    public static void ovejas(){
        Scanner teclado = new Scanner(System.in);
        String[] rebano = {">",">",">"," ","<","<","<"};
        String[] ganador= {"<","<","<"," ",">",">",">"};
        boolean jugando = true;
        //primerMovimiento(rebano, teclado);
        do {
            try {
                mostarRebano(rebano);
                teclado.nextLine();
                System.out.println("¿Que peon quiere mover? (0-6) (9 para salir)");
                int peon = teclado.nextInt();
                if (peon==9 || rebano==ganador) {
                    if (rebano==ganador) {
                        System.out.println("Ganaste");
                    }else{
                        System.out.println("Saliendo . . .");
                        jugando = false;
                    }
                }
                if (peon==0 || peon==1 || peon==5 || peon==6) {
                    if ((peon == 0 || peon == 1 || peon == 5) && rebano[peon].equals(">")) {
                        if (rebano[peon + 1].equals(" ") && rebano[peon].equals(">")) {
                            rebano[peon + 1] = rebano[peon];
                            rebano[peon] = " ";
                        }
                    }
                    if ((peon == 1 || peon == 6 || peon == 5) && rebano[peon].equals("<")) {
                        if (rebano[peon - 1].equals(" ") && rebano[peon].equals("<")) {
                            rebano[peon - 1] = rebano[peon];
                            rebano[peon] = " ";
                        }
                    }
                }else if (peon < 7 && peon > -1) {
                    if (rebano[peon + 2].equals(" ") && rebano[peon].equals(">")) {
                        rebano[peon + 2] = rebano[peon];
                        rebano[peon] = " ";
                    } else if (rebano[peon - 2].equals(" ") && rebano[peon].equals("<")) {
                        rebano[peon - 2] = rebano[peon];
                        rebano[peon] = " ";
                    } else if (rebano[peon + 1].equals(" ") && rebano[peon].equals(">")) {
                        rebano[peon + 1] = rebano[peon];
                        rebano[peon] = " ";
                    } else if (rebano[peon - 1].equals(" ") && rebano[peon].equals("<")){
                        rebano[peon - 1] = rebano[peon];
                        rebano[peon] = " ";
                    } else {
                        System.out.println("No se puede mover");
                    }
                } else {
                    System.out.println("Esa posicion no existe");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No se puede mover");
            }
        } while (jugando);

    }

    private void primerMovimiento(String[] rebano, Scanner teclado) {
        boolean comenzado = false;
        while (!comenzado) {
            mostarRebano(rebano);
            System.out.println("¿Que peon quiere mover?");
            int peon = teclado.nextInt();
            if (peon!=2 && peon!=4) {
                System.out.println("No se puede mover");
            }else {
                rebano[3] = rebano[peon];
                rebano[peon] = " ";
                comenzado = true;
            }
        }
    }

    private static void mostarRebano(String[] rebano) {
        System.out.println("");
        for (int i = 0; i < rebano.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println("");
        for (int i = 0; i < rebano.length; i++) {
            System.out.print("|" + rebano[i]);
        }
        System.out.print("|\n");
    }

}

