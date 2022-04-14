package Semana1.Polimorfismo;

public class Crunch extends ChocolateStick{
    public String marca;

    Crunch (){
        hechoDe += ", arroz inflado";
        marca = "Nestle";
    }

    @Override
    public String toString() {
        return super.toString()+ " | Marca:"+marca;
    }
}
