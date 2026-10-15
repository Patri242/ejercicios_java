package hojaEjercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     *
     * @author Patri
     * @version 1.1
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        byte nota;

        System.out.println("Introduce una nota: ");
        nota =teclado.nextByte();

        if(nota<0 || nota>10){
            System.out.println("La nota no es valida");

        }else
            System.out.println("La nota es " +nota);



    }


}
