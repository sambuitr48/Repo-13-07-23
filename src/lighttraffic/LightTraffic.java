package lighttraffic;

public class LightTraffic {
    public String color;
    public boolean estado;
    public String mostrarEstado(){
        if (estado){
            return "semaforo encendido";
        } else {
            return "semaforo apagado";
        }
    }
    public String mostrarMensaje(){
        if(color.equals("verde")){
            return "siga";
        } else if (color.equals("rojo")){
            return "pare";
        } else if (color.equals("amarillo")) {
            return "desacelere";
        } else {
            return "esta dañado";
        }
    }
}
