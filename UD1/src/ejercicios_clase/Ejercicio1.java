package ejercicios_clase;

public class Ejercicio1 {
    static void main() {
        //Declaramos las variables a y b: pueden ser int o char
        int a=3, b=4;
        int aux; //asignar variables declarandolas arriba del todo

        System.out.println("El valor de a es: "+ a + " El valor de b es: " + b);


        //intercambio a por bx, creo una variable auxiliar
        aux=a;
        a=b;
        b=aux;

        System.out.println("El valor de a después del intercambio es: " + a + " El valor de b después del intercambio es " + b );
    }
}
