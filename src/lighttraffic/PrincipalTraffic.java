package lighttraffic;

public class PrincipalTraffic {
    public static void main(String[] args) {
        LightTraffic semaforo = new LightTraffic();
        semaforo.color = "rojo";
        semaforo.estado = true;
        if (semaforo.estado){
            System.out.println(semaforo.mostrarMensaje());
        }
    }
}
