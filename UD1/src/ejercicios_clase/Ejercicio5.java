package ejercicios_clase;

public class Ejercicio5 {

    static void main() {
        //declaramos 4 variables de tipo int
        int var1=1, var2=5, var3=10, var4=2;
        //suma de los 4 numeros
        int suma= var1+var2+var3+var4;
        System.out.println("El resultado de la primera operación es: " +suma);
        int producto= var1*10000;

        System.out.println("El resultado de la segunda operación es: " +producto);
        //num real, o float o double(+grande), resultado es el num real mayor. int division entre 3
        //casting
        double division_real=((float)var2)/3;
        System.out.println("El resultado de la tercera operación es: " +division_real);

        int division_entera=var3/var4;
        System.out.println("El resultado de la cuarta operación es: " +division_entera);

        int resto=var1%var2;
        System.out.println("El resultado de la quinta operación es: " +resto);
    }
}
