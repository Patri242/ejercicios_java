package Pruebas;

public class Condicionales1 {
    static void main() {
        int edad = 10;
        //si solo tiene 1 sentencia no hace falta poner llaves{}, si tiene mas de 1 linea si
        if (edad >= 18) {
            System.out.println("Soy mayor de edad");
        } else if (edad == 17) {
            System.out.println("Estoy a punto de cumplir la mayoria de edad");
        } else if (edad >= 0 && edad <= 4) {
            System.out.println("soy un bebe");
        } else if (edad < 0) {
            System.out.println("No existe");
        }else
            System.out.println("adenosintinucleotido");
    }
}
