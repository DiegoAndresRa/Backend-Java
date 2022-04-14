package Semana1.Huevokinder;

public class SantaKlaus {
    /* Campos */
    public String atuendo;
    public int barba;
    public int edad;

    /* Constructures */
    public SantaKlaus (){
    }
    public SantaKlaus ( int barba, int edad){
        this.barba = barba;
        this.edad = edad;
    }
    public SantaKlaus ( String atuendo, int barba, int edad){
        this(barba,edad);
        this.atuendo = atuendo;
    }

    /* Getters */
    public String getAtuendo (){  return atuendo;  }
    public int getEdad (){  return edad;  }
    public int getbarba (){  return barba;  }

    /* Setters */
    public boolean setAtuendo (String atuendo){
        if(!atuendo.isEmpty()){
            this.atuendo = atuendo;
            return true;
        }else
            return false;
    }

    public boolean setEdad (int edad){
        if(edad > 0){
            this.edad = edad;
            return true;
        }else
            return false;
    }

    public boolean setBarba (int barba){
        if(barba > 0){
            this.barba = barba;
            return true;
        }else
            return false;
    }

}
