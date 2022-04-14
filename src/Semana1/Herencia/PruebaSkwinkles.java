package Semana1.Herencia;

public class PruebaSkwinkles {
    public static void main(String[] args) {
        System.out.println(def());
    }
    public static String def(){
        Skwinkles clasicos = new Skwinkles();
        Rellenos rellenos = new Rellenos();
        Skwinklote skwinklote = new Skwinklote();

        String msgClasicos = "Forma: "+clasicos.forma +
                " | Tamaño: "+clasicos.size +
                " | Hechos de: "+clasicos.hechoDe +
                " | Sabor: "+clasicos.sabor;
        String msgRellenos = "Forma: "+rellenos.forma +
                " | Tamaño: "+rellenos.size +
                " | Hechos de: "+rellenos.hechoDe +
                " | Sabor: "+rellenos.sabor +
                " | Relleno: "+rellenos.relleno;
        String msgSkwinklotes = "Forma: "+skwinklote.forma +
                " | Tamaño: "+skwinklote.size +
                " | Hechos de: "+skwinklote.hechoDe +
                " | Sabor: "+skwinklote.sabor +
                " | Relleno: "+skwinklote.relleno;
        return msgClasicos+"\n"+msgRellenos+"\n"+msgSkwinklotes;

        //System.out.println(msgClasicos +"\n"+msgRellenos +"\n"+ msgSkwinklotes);
    }
}
