package ejercicios_clase3;

public class Ejercicio5 {
    static void main() {

        final double sueldo_fijo=1000, retencion_ss=-150, retencion_irpf=(double)18/100;

        double sueldo_liquido, kilometros=300, dia=4, importe_ventas=20,
                dietas=60*dia, kilometraje=1*kilometros , comision=((double)5/100) * importe_ventas,
                total_irpf= sueldo_fijo - retencion_irpf * sueldo_fijo;

        sueldo_liquido= comision + kilometraje + dietas + retencion_ss + total_irpf;

        System.out.println("El sueldo liquido a percibir es: " + sueldo_liquido);
    }
}
