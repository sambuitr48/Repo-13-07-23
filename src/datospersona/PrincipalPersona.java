package datospersona;

public class PrincipalPersona {
    public static void main(String[] args){
        Datos persona = new Datos();
        persona.id = "1094890642";
        persona.name = "Samuel Buitrago Osorio";
        persona.mail = "sbuitrago2223@cue.edu.co";
        System.out.println(persona.mostrarDatos());

    }
}
