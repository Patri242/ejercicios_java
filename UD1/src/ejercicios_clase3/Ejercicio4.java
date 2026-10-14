package ejercicios_clase3;

public class Ejercicio4 {
    static void main() {
        double precio_compra=100, ganancia=(double)30/100;
        //obtiene ganancia 30%

        ganancia=precio_compra*ganancia + precio_compra;
        System.out.println("Debe venderlo a " + ganancia + " para obtener una ganacia del 30%");
    }
}
