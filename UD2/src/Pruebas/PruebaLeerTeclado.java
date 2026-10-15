package Pruebas;

import java.util.Scanner;

public class PruebaLeerTeclado {
    static void main() {
        Scanner teclado= new Scanner(System.in);
        Scanner teclado2= new Scanner(System.in);
        int x=12;
        double y;
        String cadena;



        System.out.println("Introduce un valor entero:");
        x=teclado.nextInt();
        System.out.println("El valor de x es: " +x);

        System.out.println("Introduce un valor doble:");
        y= teclado.nextDouble();
        System.out.println("El valor de y es: " + y);

        System.out.println("Introduce una cadena de texto: ");
        //12\n6\nhola\squetal\n
        //todos los metodos; nextDouble, nextInt, next ---> dejan el enter \n, ignoran \n del inicio
        //teclado.next();-ignora salto de linea
        //en vez de utilizar el next() usar nextLine- elimina el salto de linea- usar despues de un nextInt...
        teclado.nextLine();
        cadena= teclado.nextLine();
        System.out.println("El valor de la cadena es: " + cadena);

        //no hay para leer 1 caracter
        System.out.println("Introduce un caracter: ");
        char car= teclado.next().charAt(0);
        System.out.println("El valor del caracter es: ");



    }
}
