package ejercicios_clase;

public class Ejercicio11 {
    static void main() {
        //calculo aumento inversion, inversion inicial -15000 euros
        //primer año +7%
        //pierde 350 segundo año
        //aumenta 14% tercer año
        double inversion_inicial = 15000;
        double ganancias=0;

        ganancias += inversion_inicial*((double)7/100);
        ganancias-= 350;
        ganancias += ganancias*((double)14/100);

        double saldo_total =inversion_inicial + ganancias;

        System.out.println("Al final del año he ganado: " + ganancias);
        System.out.println("En total he ganado: " + saldo_total);
    }
}
