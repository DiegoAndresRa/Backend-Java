/*
    Abstraccicón
    Composición
    Métodos
    Componentes
    Constructores
 */
package Semana1.Huevokinder;

public class PruebaKlaus {
    public static void main(String[] args) {
        def();
    }
    public static void def(){
        SantaKlaus santa = new SantaKlaus("Traje rojo, botas negras y guantes blancos",20,60);
        int count = 0;
        /*
        santa.setEdad(60);
        santa.setBarba(20);
        santa.setAtuendo("Traje rojo, botas negras y guantes blancos");
        */
        String message = "Este es Santa:\n" +
                "Tiene " +santa.edad+" años.\n" +
                "Posee una barba de "+santa.barba+" cm.\n" +
                "Su atuendo esta conformado por: "+santa.atuendo;
        System.out.println(message);
    }
}
