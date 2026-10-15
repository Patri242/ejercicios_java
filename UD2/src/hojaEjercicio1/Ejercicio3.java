package hojaEjercicio1;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado= new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un número entero: ");
        numero=teclado.nextInt();

        if (numero!=0 && numero % 2==0 ){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
