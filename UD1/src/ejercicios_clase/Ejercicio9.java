package ejercicios_clase;

public class Ejercicio9 {
    static void main() {
        //media 4 numeros enteros/media 4 num reales
        int num1=1, num2=2, num3=3, num4=4, total;
        double ud1=7, ud2=8, ud3=9, ud4=10, totalR;

        total=num1+num2+num3+num4;
        double media_enteros= (double)total / 4;

        totalR=ud1+ud2+ud3+ud4;
        double media_reales= totalR/4;

        System.out.println("La media de los numeros enteros es: "+media_enteros+ " y la media de los numeros reales es: "+media_reales);


    }
}
