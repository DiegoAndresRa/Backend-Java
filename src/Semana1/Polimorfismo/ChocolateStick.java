package Semana1.Polimorfismo;

public class ChocolateStick extends ChocolateDulce {
    public String forma;

    public ChocolateStick (){
        forma = "cilindrica";
    }

    @Override
    public String toString() {
        return super.toString()+" | Forma:"+forma;
    }
}
