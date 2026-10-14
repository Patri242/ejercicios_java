package ejercicios_clase;

public class Joven {

    static void main() {
        //declaramos las variables
        int edad, nivel_de_estudios, ingresos;
        boolean var;
        //Asignamos a var verdadero o falso en funcion de si se cumplen esas condiciones
        //edad menor o igual a 28
        edad=15;
        nivel_de_estudios=4;
        ingresos=38000;

        var= (edad<=28) && (nivel_de_estudios>3) && (ingresos >28000);
        System.out.println(var);


    }

}
