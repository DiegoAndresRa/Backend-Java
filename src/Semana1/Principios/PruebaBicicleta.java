package Semana1.Principios;

import Semana1.Principios.Bicicleta;

public class PruebaBicicleta {
    public static void main(String[] args) {
        def();
    }
    public static void def() {
        Bicicleta biciMontana = new Bicicleta();
        biciMontana.setVelocidad (13.2);
        biciMontana.setRodada (26);
        biciMontana.setPins (6);

        String msg = "Soy una bici de montaña con estas caracteristicas: ";
        msg += "\nVelocidad: "+biciMontana.getVelocidad();
        msg += "\nPins: "+biciMontana.getPins();
        msg += "\nRodad: "+biciMontana.getRodada();

        System.out.print(msg);
    }
}
