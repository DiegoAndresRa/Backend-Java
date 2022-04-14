package Semana1.Polimorfismo;

public class ChocolateDulce {
    public String hechoDe;
    public String color;

    public ChocolateDulce (){
        hechoDe = "cacao con leche";
        color = "cafe";
    }
    public static boolean derretimiento (){
        return true;
    }

    @Override
    public String toString() {
        return "Hecho de: "+hechoDe+
                " | Color: "+color;
    }
}
