package switch1;

public class Switch1 {
    public int option;
    public String showOption(){
        switch (option){
            case 1:{
                return "su premio es una gorra..."; /*no hay break ya que el return hace la funcion de break*/
            }
            case 2:{
                return "Su premio es bombon";
            }
            default:{
                return "opcion incorrecta";
            }
        }
    }
}
