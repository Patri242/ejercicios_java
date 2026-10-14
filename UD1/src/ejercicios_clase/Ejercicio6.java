package ejercicios_clase;

public class Ejercicio6 {
    static void main() {
        //declaramos 4 variables de tipo real
        float var1=1, var2=5, var3=10, var4=2;
        //suma de los 4 numeros
        double suma= var1+var2+var3+var4;
        System.out.println("El resultado de la primera operación es: " +suma);
        double producto= var1*10000;
        System.out.println("El resultado de la segunda operación es: " +producto);
        //num real, o float o double(+grande), resultado es el num real mayor. int division entre
        double division_real=var2/3;
        System.out.println("El resultado de la tercera operación es: " +division_real);

        int division_entera=(int)(var3/var4);
        System.out.println("El resultado de la cuarta operación es: " +division_entera);

        double resto=var1%var2;
        System.out.println("El resultado de la quinta operación es: " +resto);
    }
}
