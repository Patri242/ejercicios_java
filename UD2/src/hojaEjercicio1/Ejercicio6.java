package hojaEjercicio1;


import java.util.Scanner;

/**
 * Programa que visualice el número de días dado un mes y un
 * año.
 *  Si el mes es febrero el mensaje a visualizar será “El mes número 2 tiene 28 días
 * si el año no es bisiesto y 29 si lo es”.
 *  Para ello debe pedir por pantalla el mes y el año.
 *  Realiza el ejercicio utilizando la estructura switch y sin switch
 * @author Patri
 * @version 1.0
 * para ser bisiesto debe ser divisible entre 4
 * si el año termina en dos ceros debe poder divirdirse entre 400 de manera exacta
 */

public class Ejercicio6 {

    static void main() {

        int año, dias, mes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el año");
        año = teclado.nextInt();

        System.out.println("Introduce el número de mes");
        mes = teclado.nextInt();
        //Si fuese un string-> dado que antes hemos leido un int y ahora leemos una cadena hacemos un salto
        //teclado.nextLine();


        if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            dias=31;
            System.out.println("El número de días del mes es: "+dias);
        } else if (mes==4||mes==6||mes==9||mes==11) {
            dias=30;
            System.out.println("El número de días del mes es: "+dias);
        } else if (mes==2) {
            if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                dias=29;
                System.out.println("Ya que es bisiesto tiene "+dias +" dias");
            }else{
                dias=28;
                System.out.println("Ya que no es bisiesto tiene "+dias +" dias");
            }
        }else {
            System.out.println("Introduce un número de mes correcto (1-12)");
        }


    }
}
