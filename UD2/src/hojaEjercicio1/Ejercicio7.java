package hojaEjercicio1;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        byte opcion;
        Scanner teclado= new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("*******************");
        System.out.println("1. CUADRADO");
        System.out.println("2. RECTANGULO");
        System.out.println("3. TRIANGULO");
        System.out.println("4. CIRCULO");
        System.out.println("*******************");

        System.out.println("INTRODUCE LA OPCION: ");
        opcion=teclado.nextByte();

        switch (opcion){
            case 1 -> System.out.println("CUADRADO");
            case 2 -> System.out.println("RECTANGULO");
            case 3 -> System.out.println("TRIANGULO");
            case 4 -> System.out.println("CIRCULO");
            default -> System.out.println("Opción incorrecta");
        }
        System.out.println("Fin del programa");
    }
}
