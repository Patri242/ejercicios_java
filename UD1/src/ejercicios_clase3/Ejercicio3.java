package ejercicios_clase3;

public class Ejercicio3 {
    static void main() {
        double ginecologia=(double)40/100, traumatologia=(double)30/100, pediatria=(double)30/100
                ,presupuesto_gine, presupuesto_trauma, presupuesto_pedia;
        int presupuesto= 120000;

        presupuesto_gine= ginecologia*presupuesto;
        presupuesto_trauma= traumatologia*presupuesto;
        presupuesto_pedia= pediatria*presupuesto;

        System.out.println("El presupuesto de ginecologia es: " + presupuesto_gine + "%");
        System.out.println("El presupuesto de traumatologia es:"+ presupuesto_trauma + "%");
        System.out.println("El presupuesto de pediatria es:"+ presupuesto_pedia + "%");
    }
}
