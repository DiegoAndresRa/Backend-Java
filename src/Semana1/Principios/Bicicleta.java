package Semana1.Principios;

public class Bicicleta {
    // Campos o Atributos
    public int rodada, bins;
    public double velocidad;

    // Get y Set
    public int getRodada () {  return rodada; }
    public int getPins () {  return bins;  }
    public double getVelocidad () {  return velocidad;  }

    public boolean setRodada (int rodada) {
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }
    public boolean setPins (int bins) {
        if(bins > 0){
            this.bins = bins;
            return true;
        }else
            return false;
    }
    public boolean setVelocidad (double velocidad) {
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }
}
