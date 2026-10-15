package hojaEjercicio1;


import java.util.Scanner;

/**Javadoc:
 * Al salario bruto tenemos que descontarle las retenciones.
  Estas retenciones dependerán del número de hijos de acuerdo con la siguiente
 tabla:
 NÚMERO DE HIJOS RETENCIONES %
 2 o menos 20
 Entre 3 e 5 (incluido) 15
 Entre 5 e 7 (incluido) 10
 Ejercicios1 Tema 4:
 Estructuras Control
 Programación Eva López
 Página 5
 Entre 7 e 9 (incluido) 5
 10 o más 0
  Datos de entrada: salario bruto de tipo float y número de hijos de tipo int.
  Visualizar: salario bruto, descuento en euros y salario neto
 * @author Patri
 * @version
 */
public class Ejercicio5 {

    static void main() {
        //variables empiezan en minuscula siempre(y se utiliza camelcase), al igual que los paquetes
        float salarioBruto, retencion, salarioNeto, descuento ;
        int  numHijos;
        //declaramos un objeto tipo scanner
        Scanner teclado= new Scanner(System.in);

        System.out.println("Introduce el salario bruto");
        salarioBruto=teclado.nextFloat();

        //calculamos el descuento
        if(salarioBruto<0){
            System.out.println("Salario incorrecto");
        }else {
            System.out.println("Introduce el numero de hijos");
            numHijos = teclado.nextInt();
            if(numHijos<0) {
                System.out.println("El numero de hijos es incorrecto");
            }else{
                if (numHijos <= 2) {
                retencion=0.2f;
                salarioNeto=salarioBruto-salarioBruto*retencion;
                    System.out.println("Con salario bruto " + salarioBruto + "euros y aplicando el descuento del 20% obtenemos "+salarioNeto+"euros de salario neto");
                } else if ( numHijos <=5) {
                    retencion=0.15f;
                    salarioNeto=salarioBruto-salarioBruto*retencion;
                    System.out.println("Con salario bruto " + salarioBruto + "euros y aplicando el descuento del 15% obtenemos "+salarioNeto+"euros de salario neto");
                } else if (numHijos <=7) {
                    retencion=0.1f;
                    salarioNeto=salarioBruto-salarioBruto*retencion;
                    System.out.println("Con salario bruto " + salarioBruto + "euros y aplicando el descuento del 10% obtenemos "+salarioNeto+"euros de salario neto");
                }else if (numHijos <=9) {
                    retencion=0.05f;
                    salarioNeto=salarioBruto-salarioBruto*retencion;
                    System.out.println("Con salario bruto " + salarioBruto + "euros y aplicando el descuento del 5% obtenemos "+salarioNeto+"euros de salario neto");
                }else{
                    retencion=0;
                    salarioNeto=salarioBruto-salarioBruto*retencion;
                    System.out.println("Con salario bruto " + salarioBruto + "euros y aplicando el descuento del 0% obtenemos "+salarioNeto+"euros de salario neto");
                }

            }

        }
    }

}
