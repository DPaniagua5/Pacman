package JuegoPacman;

import java.util.Scanner;
import java.util.Random;


public class Main {
    static Scanner scanner = new Scanner(System.in);


    static String[] nombre = new String[10];
    static String name;
    static int[] edad = new int[10];
    static int años;
    static int[] puntos = new int[10];
    static int mpuntos;
    static int[] movimientos = new int[10];

    static int q;
    static int menu;


    public static void main(String[] args) {

        do {
            for (q=0; q< edad.length; q++) {
                System.out.println("**********************" );
                System.out.println("* 1. Jugar           *" );
                System.out.println("* 2. Historial       *");
                System.out.println("* 3. Salir           *" );
                System.out.println("**********************");
                menu = scanner.nextInt();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                switch (menu) {

                    case 1:
                        Juego.juego();
                        break;
                    case 2:
                        hist.historia();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción invalida");
                }
            }

        }while (menu != 3) ;
    }

    public class Juego {
        static Scanner scanner = new Scanner(System.in);

        static void juego() {
            Random rnd = new Random();
            int m, n;
            int x, y = 0;
            int Puntaje = 10;
            int posicionVerticalPM = 5;
            int posicionHorizontalPM = 2;
            int posicionVerticalPmAnterior = posicionVerticalPM;
            int posicionHorizontalPmAnterior = posicionHorizontalPM;

            System.out.println("Ingrese su nombre:");
            name = scanner.next();


            System.out.println("Ingrese su edad: ");
            años = scanner.nextInt();

            System.out.println("PARA COMENZAR A JUGAR, SELECCIONE EL TAMAÑO DE SU TABLERO");
            do {
                System.out.println("INGRESE EL TAMAÑO DE FILAS: ");
                m = scanner.nextInt();
                if (m < 8) {
                    System.out.println("Valor no válido");
                }
            } while (m < 8);
            do {
                System.out.println("INGRESE EL TAMAÑO DE COLUMNAS: ");
                n = scanner.nextInt();
                if (n < 8) {
                    System.out.println("Valor no válido");
                }
            } while (n < 8);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            int minimoColumnas = 1;
            int maximoColumnas = n - 4;

            int minimoFilas = 1;
            int maximoFilas = m - 4;

            String[][] matriz = new String[m][n];
            int contador = 0;

            for (x = 0; x < matriz.length; x++) {
                for (y = 0; y < matriz[x].length; y++) {
                    if (x == 0 || x == matriz.length - 1) {
                        String muros = "***";
                        int muros1 = rnd.nextInt(muros.length());
                        char Amuros = muros.charAt(muros1);
                        matriz[x][y] =String.valueOf(Amuros);
                    } else if ((x == m / 2 || x == (m / 2) + 1) && (y == 0 || y == matriz[x].length - 1)) {
                        String muros = "   ";
                        int muros1 = rnd.nextInt(muros.length());
                        char Amuros = muros.charAt(muros1);
                        matriz[x][y] = String.valueOf(Amuros);
                    } else if (x == 5 && y == 2) {
                        String GPackamns = "VVV";
                        int NPackmans = rnd.nextInt(GPackamns.length());
                        char Packman = GPackamns.charAt(NPackmans);
                        matriz[x][y] = String.valueOf(Packman);
                    } else if (y == 0 || y == matriz[x].length - 1) {
                        String muros = "***";
                        int muros1 = rnd.nextInt(muros.length());
                        char Amuros = muros.charAt(muros1);
                        matriz[x][y] = String.valueOf(Amuros);
                    } else if (x == 3 && y == 4) {
                        String comida1 = "$$$";
                        int Comida1 = rnd.nextInt(comida1.length());
                        char C1 = comida1.charAt(Comida1);
                        matriz[x][y] = String.valueOf(C1);
                    } else if (x == 5 && y == 8) {
                        String comida2 = "###";
                        int Comida2 = rnd.nextInt(comida2.length());
                        char C2 = comida2.charAt(Comida2);
                        matriz[x][y] =String.valueOf(C2);
                    } else if (x == 4 && y == 10) {
                        String comida3 = "@@@";
                        int Comida3 = rnd.nextInt(comida3.length());
                        char C3 = comida3.charAt(Comida3);
                        matriz[x][y] = String.valueOf(C3);
                    } else if (x != 0 && y != 0) {
                        String obstaculos = "  *  * ";
                        int Nobstaculos = rnd.nextInt(obstaculos.length());
                        char NO = obstaculos.charAt(Nobstaculos);
                        matriz[x][y] = String.valueOf(NO);
                    }
                }
            }


            while (Puntaje > 0 && Puntaje < 99) {
                String movimiento = scanner.nextLine();
                switch (movimiento) {
                    case "w":
                        posicionVerticalPM--;
                        posicionVerticalPmAnterior = posicionVerticalPM;
                        posicionVerticalPmAnterior++;
                        posicionHorizontalPmAnterior = posicionHorizontalPM;
                        contador = contador + 1;
                        break;
                    case "s":
                        posicionVerticalPM++;
                        posicionVerticalPmAnterior = posicionVerticalPM;
                        posicionVerticalPmAnterior--;
                        posicionHorizontalPmAnterior = posicionHorizontalPM;
                        contador = contador + 1;
                        break;
                    case "a":
                            posicionHorizontalPM--;
                            if (posicionHorizontalPM== -1){
                                posicionHorizontalPM=posicionHorizontalPM+matriz.length;
                                posicionHorizontalPmAnterior = 1;
                                posicionHorizontalPmAnterior--;
                                posicionVerticalPmAnterior = posicionVerticalPM;

                                matriz[posicionVerticalPM][posicionHorizontalPM] = "V";
                                matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] = " ";
                                contador = contador + 1;
                            }else {
                                posicionHorizontalPmAnterior = posicionHorizontalPM;
                                posicionHorizontalPmAnterior++;
                                posicionVerticalPmAnterior = posicionVerticalPM;
                                contador = contador + 1;
                            }
                            break;
                    case "d":
                        posicionHorizontalPM++;
                        if(posicionHorizontalPM == (matriz.length)){
                            posicionHorizontalPM = 0;
                            posicionHorizontalPmAnterior = matriz.length-2;
                            posicionHorizontalPmAnterior++;
                            posicionVerticalPmAnterior = posicionVerticalPM;

                            matriz[posicionVerticalPM][posicionHorizontalPM] = "V";
                            matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] = " ";
                            contador = contador + 1;
                        }else {
                            posicionHorizontalPmAnterior = posicionHorizontalPM;
                            posicionHorizontalPmAnterior--;
                            posicionVerticalPmAnterior = posicionVerticalPM;
                            contador = contador + 1;
                        }
                        break;
                    case "m":
                        mpuntos=Puntaje;
                        Puntaje = -1;
                        break;
                }
                int columnaRandom;
                int filaRandom;
                switch (matriz[posicionVerticalPM][posicionHorizontalPM]) {
                    case "$":
                        matriz[posicionVerticalPM][posicionHorizontalPM] ="V";
                        matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] = " ";
                        columnaRandom = rnd.nextInt(maximoColumnas + minimoColumnas) + minimoColumnas;
                        filaRandom = rnd.nextInt(maximoFilas + minimoFilas) + minimoFilas;

                        if (matriz[filaRandom][columnaRandom] != "#" && matriz[filaRandom][columnaRandom]
                                != "@" && matriz[filaRandom][columnaRandom] != "V" && matriz[filaRandom][columnaRandom] != "*") {
                            matriz[filaRandom][columnaRandom] ="$";
                        }
                        Puntaje = Puntaje + 15;
                        break;
                    case "#":
                        matriz[posicionVerticalPM][posicionHorizontalPM] = "V";
                        matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] = " ";
                        columnaRandom = rnd.nextInt(maximoColumnas + minimoColumnas) + minimoColumnas;
                        filaRandom = rnd.nextInt(maximoFilas + minimoFilas) + minimoFilas;

                        if (matriz[filaRandom][columnaRandom] != "@" && matriz[filaRandom][columnaRandom]
                                != "$" && matriz[filaRandom][columnaRandom] != "V" && matriz[filaRandom][columnaRandom] != "*") {
                            matriz[filaRandom][columnaRandom] = "#";
                        }
                        Puntaje = Puntaje - 10;
                        break;
                    case "@":
                        matriz[posicionVerticalPM][posicionHorizontalPM] = "V" ;
                        matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] = " ";
                        columnaRandom = rnd.nextInt(maximoColumnas + minimoColumnas) + minimoColumnas;
                        filaRandom = rnd.nextInt(maximoFilas + minimoFilas) + minimoFilas;

                        if (matriz[filaRandom][columnaRandom] != "#" && matriz[filaRandom][columnaRandom]
                                != "$" && matriz[filaRandom][columnaRandom] != "V" && matriz[filaRandom][columnaRandom] !=  "*") {
                            matriz[filaRandom][columnaRandom] =  "@" ;
                        }
                        Puntaje = Puntaje + 10;
                        break;
                    case  "*"  :
                        matriz[posicionVerticalPM][posicionHorizontalPM] = "*" ;
                        posicionVerticalPM = posicionVerticalPmAnterior;
                        posicionHorizontalPM = posicionHorizontalPmAnterior;
                        matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] = "V";
                        break;
                    case  " ":
                            matriz[posicionVerticalPM][posicionHorizontalPM] = "V" ;
                            matriz[posicionVerticalPmAnterior][posicionHorizontalPmAnterior] =" ";
                        break;
                }
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Nombre: " + name);
                System.out.println("Punteo: " + Puntaje);
                System.out.println("Movimientos: " + contador);

                for (x = 0; x < matriz.length; x++) {
                    for (y = 0; y < matriz[x].length; y++) {
                        System.out.print(matriz[x][y]);
                        if (y != matriz[x].length - 1) System.out.print("\t");
                    }
                    System.out.println("");
                }
            }
            if (Puntaje >= 100) {
                System.out.println("Felicidades Gansate el juego con " + Puntaje + " puntos.");
                nombre[q] = name;
                edad[q] = años;
                movimientos[q] = contador;
                puntos[q] = Puntaje;

            } else if (Puntaje == 0 || Puntaje == -10 || Puntaje == -5) {
                System.out.println("Perdiste");
                nombre[q] = name;
                edad[q] = años;
                movimientos[q] = contador;
                puntos[q] = Puntaje;
            } else if (Puntaje == -1) {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Juego cancelado");

                nombre[q] = name;
                edad[q] = años;
                movimientos[q] = contador;
                puntos[q] = mpuntos;
            }
        }
    }


    public class hist {
        static void historia() {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*****************************");
            for (q = 0; q < edad.length; q++) {
                if (edad[q] == 0) {
                } else {
                    System.out.println("+ Nombre: " + nombre[q]);
                    System.out.println("+ Edad: " + edad[q]);
                    System.out.println("+ Movimientos: " + movimientos[q]);
                    System.out.println("+ Puntaje: " + puntos[q]);
                    System.out.println("*****************************");
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
}





