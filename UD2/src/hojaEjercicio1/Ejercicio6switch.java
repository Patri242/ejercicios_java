package hojaEjercicio1;

import java.util.Scanner;

public class Ejercicio6switch {
    static void main() {

        int año, dias, mes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el año");
        año = teclado.nextInt();

        System.out.println("Introduce el número de mes");
        mes = teclado.nextInt();

        switch (mes) {
            //el moderno sería case... -> {}; (no necesita break)
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                System.out.println("El número de días del mes es: " + dias);
                break;
            case 4, 6, 9, 11:
                dias = 30;
                System.out.println("El número de días del mes es: " + dias);
                break;
            case 2:

                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    dias = 29;
                    System.out.println("Ya que es bisiesto tiene " + dias + " dias");
                } else {
                    dias = 28;
                    System.out.println("Ya que no es bisiesto tiene " + dias + " dias");
                }
                break;

            default:
                System.out.println("Introduce un número de mes correcto (1-12)");
        }
        }
    }

