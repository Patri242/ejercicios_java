package tema2_3;

public class Ejercicio1 {
    static void main() {
        System.out.println ('a');//1 carácter me deja entre ''
        System.out.println(" ");
        System.out.println("Caminando " + 'a' + " casa");//concatenación
        // El resultado de concatenar 1 cadena con 1 carácter es 1 cadena


        double p=1212;//valor mas grande
        int k=23;
        short z=12;
        float f=12f;
        double suma=(int) (p+k+z+f);//se asigna double ya q es el mas grande
        //un valor puede contener otro mientras sea mas grande excepto boolean
        //double<float<

        //casting- consiste en cambiar el tipo de dato de forma manual, un Int cabe en un Long

        //6. char x='b'; b++; System.out.println(b)// No es posible ya que es tipo char, y añadir 1 imposible
        int x = 17, y = 10; System.out.println("resultado= " + x/10 + y);//si es posible
        int q = 10; float w= q; System.out.println(++w);
        int v = 10; float m= v; System.out.println(m++);



        int num1=2;
        int num2=3;
        System.out.println("El resultado de la suma es"+ num1+num2);// concatenados porque una cadena se convierte en una concatenación
        System.out.println(num1+num2 + " Es el verdadero resultado de la suma");
        System.out.println("El resultado de la suma es "+ (num1+num2));//prioridad de ()



    }
}
