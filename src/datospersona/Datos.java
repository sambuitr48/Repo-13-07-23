package datospersona;

public class Datos {
    public String id;
    public String name;
    public String mail;
    public String mostrarDatos(){
        return "La cédula de la persona es " + id + "su nombre es: " + name + "y su correo electronico es: " + mail;
    }
}
