package ejercicios_clase3;

public class Ejercicio1 {
    static void main() {
    //calificacion final
    double calificacion_final, calificacion1, calificacion2, calificacion3,
            parcial1=6, parcial2=5.5, parcial3=10, examen_final=6.7, practica=9 ;
    //65% media tres clasificaciones parcial
    calificacion1=((parcial1 + parcial2+ parcial3)/3)*((double)65/100);
    //20% calificación examen final
    calificacion2= examen_final * ((double)20/100);
    //15% calificación práctica
    calificacion3= practica * ((double) 15/100);

    calificacion_final=calificacion1+calificacion2+calificacion3 ;
        System.out.println("La calificación final es: " + calificacion_final);







    }
}
