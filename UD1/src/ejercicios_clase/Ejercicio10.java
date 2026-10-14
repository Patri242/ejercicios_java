package ejercicios_clase;

public class Ejercicio10 {
    static void main() {
        //area y perimetro triangulo y cuadrado equilateros lado 3cm
        //cuadrado area: lado^2, perimetro-suma de todos sus lados
        //triangulo equilatero area: base por altura /2-->/2 perimetro -> 3 * 1 lado

        int lado=3;
        double area_cuadrado=lado*lado, perimetro_cuadrado=lado+lado,
                area_triangulo=(lado*lado)/2, perimetro_triangulo=3 *lado; //sumando sus lados
        //si tengo que realizar una operacion matematica pero no puedo-Math
        double area = Math.sqrt(3);//raiz cuadrada de 3
        double cuadrado= Math.pow(lado,2);//lado * lado
        //raiz cuadrada de 3 por lado al cuadrado /4


        /** Correccion
        area_triangulo=(Math.sqrt(3)*Math.pow(lado,2))/4;
        perimetro_triangulo= lado*3;

         */
        System.out.println("El area y el perimetro del cuadrado con lado "+lado+" equivale a :" + area_cuadrado+ " y " + perimetro_cuadrado+ " respectivamente");
        System.out.println("El area y el perimetro del triangulo con lado "+lado+" equivale a :" + area_triangulo+ " y " + perimetro_triangulo+ " respectivamente");

    }
}
