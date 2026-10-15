package hojaEjercicio1;

import java.util.Scanner;


/**
 * Al efectuar una compra en un almacén, obtenemos los
 * siguientes descuentos:
 *  Si compramos más de 100 unidades de un mismo artículo, el descuento es del
 * 40%.
 *  Si compramos entre 25 y 100, el descuento es del 20%.
 *  Si compramos entre 10 y 25, el descuento es de un 10%.
 *  No hay descuento por la compra de menos de 10 unidades.
 * Calcula el importe final a pagar por una compra teniendo en cuenta que se
 * introducen por teclado el precio del artículo (tipo float, método nextFloat() y el
 * número de unidades (tipo int).
 * @author Patri
 * @version 1.0
 */
public class Ejercicio4 {

    static void main() {
        float precio_articulo, importe_final, descuento;
        int unidades;

        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el precio del articulo: ");
        precio_articulo=teclado.nextFloat();
        System.out.println("Introduce el número de unidades: ");
        unidades=teclado.nextInt();

        if (unidades >0 && precio_articulo > 0) {
            if (unidades > 100) {
                descuento = 0.4f;
                importe_final = (precio_articulo - descuento * precio_articulo) * unidades;
                System.out.println("El importe final es: " + importe_final + " aplicando 40% de descuento");
            } else if (unidades >= 25) {
                descuento = 0.2f;
                importe_final = (precio_articulo - descuento * precio_articulo) * unidades;
                System.out.println("El importe final es: " + importe_final + " aplicando 20% de descuento");
            } else if (unidades >= 10) {
                descuento = 0.1f;
                importe_final = (precio_articulo - descuento * precio_articulo) * unidades;
                System.out.println("El importe final es: " + importe_final + " aplicando 10% de descuento");
            } else {
                importe_final = precio_articulo * unidades;
                System.out.println("El importe final es: " + importe_final + " sin aplicar ningun descuento");
            }

        }else System.out.println("Error, no puede haber precio o unidades negativas");
    }
}
