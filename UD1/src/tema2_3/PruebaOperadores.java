package tema2_3;

public class PruebaOperadores {
    static void main() {
        double suma1= 10+20;
        double val1=10;
        int val2=-5;
        double suma;
        suma= val1+val2;
        System.out.println(suma1);
        System.out.println(val1 + val2);

        suma= val1%val2;//resto división

        System.out.println(suma);

        //Prioridad, 5/2 num entero-->2 %--> misma prioridad * y /
        /**
         * 1º ()[]
         * 2º ++ y --, incrementa/decrementa en 1 la unidad, signos + y -, positivo/negativo
         * 3º / * y %, div, mult, y resto
         * 4º sumas y restas
         */
        double num1= (2 * 2) ;
        double num2=5;
        double suma5= ++num1 + num2;//diferencia x++ que ++x
        System.out.println(num1); //añade permanentemente +1 al valor de num1
        System.out.println(suma5);

        int x=5;
        int y=5;
        int incremento1=++x + 5;
        int incremento2=y++ + 5;//hace primero operación, posteriormente incrementa 1 al resultado?
        System.out.println(incremento1 + " " + incremento2);
        System.out.println(y + " " + x);


        //operadores especiales
        int a=5;
        int operador1=a+=10;//hacen lo mismo, a=15
        int operador2=a=a+10;//Se guarda valor anterior, hacen lo mismo
        System.out.println(operador1+ "" + operador2);



    }
}
