package ejercicios_clase;

public class Ejercicio7 {
    static void main() {
        //programa que convierta en grados un ángulo cualquiera dado en radianes, 180º equivalen a PI radianes
        //declarar PI como constante

        double grados, radianes=1;
        final double PI=3.1415926535;
        //un angulo de 180º equivale a PI radianes

        grados= radianes *(180/PI);

        System.out.println(radianes + " radianes equivalen a "+ grados + " grados");

    }
}
