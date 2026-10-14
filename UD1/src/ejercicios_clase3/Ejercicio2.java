package ejercicios_clase3;

public class Ejercicio2 {
    static void main() {
        //% de H y M grupo- 5 M y 17 H
        int mujeres=5, hombres=17;
        double porcentajeM, porcentajeH;
        int total = mujeres+hombres;
        porcentajeM=((double)mujeres/total)*100;

        porcentajeH=((double)hombres/total)*100;

        System.out.println("El porcentaje de hombres y mujeres es: \n " + porcentajeH+ "% y " + porcentajeM + "% respectivamente");

    }
}
