package Semana1.Polimorfismo;

public class CarlosQuinto extends ChocolateStick{
    public String marca;

    CarlosQuinto (){
        marca = "Nestle";
    }

    @Override
    public String toString() {
        return super.toString()+" | Marca:"+marca;
    }
}
