
package lab2_erickcarrasco;


public class Examenes {
    private String preguntas;
    private String clase;
    
    public Examenes(){
    
    }
    
    public Examenes(String clase, String preguntas){
        this.clase= clase;
        this.preguntas=preguntas;
        
    }
    
    public void setClase(String clase){
        this.clase= clase;
    }
    
    public String getClase(String clase){
        return clase;
    }
    
    public void setPreguntas(String preguntas){
        this.preguntas= preguntas;
    }
    
    public String getPreguntas(String preguntas){
        return preguntas;
    }
    
    public String toString(){
        return "Clase: "+clase+ "\n"+"Preguntas: "+preguntas;
    }
}
