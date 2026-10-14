package ejercicios_clase;

public class Ejercicio8 {
    static void main() {
        double  ingresos=4000, tiempo=1, importe_final;
        final double intereses = (double)7/100; //casting!!!

        double ganancias = ingresos * (intereses);
        importe_final= ganancias + ingresos;
        System.out.println("El importe final a final de año será de " + importe_final+ " euros");



    }
}
