package Semana1.Polimorfismo;

public class PolimorfimoPrueba {
    public static void main (String[] args) {
        System.out.println(def());
    }
    public static String def (){
        ChocolateStick carlos_quinto = new CarlosQuinto();
        Chocogalleta chocogalleta = new Chocogalleta();
        ChocolateStick crunch = new Crunch();
        CrunchCrisp crunch_crisp = new CrunchCrisp();
        return carlos_quinto.toString() +" | Se derrite: "+carlos_quinto.derretimiento()+"\n"+
                chocogalleta.toString() +" | Se derrite: "+chocogalleta.derretimiento()+"\n"+
                crunch.toString()+" | Se derrite: "+crunch.derretimiento()+"\n"+
                crunch_crisp.toString()+" | Se derrite: "+crunch_crisp.derretimiento();
    }
}
