package vendingMachine;

public class Menu {
    public int money;
    public int price;
    public int option;
    public int p1Disponible;
    public int p2Disponible;
    public int p3Disponible;
    public void comprarProducto(){
        switch(option){
            case 1:{
                if (p1Disponible > 0 && money >= price){
                    System.out.println("su producto esta en la bandeja " + "el costo es: " + price);
                    p1Disponible--;
                    money -= price;
                } else {
                    System.out.println("perdio,parcero");
                } break;

            }
            case 2:{
                if (p2Disponible > 0 && money >= price){
                    System.out.println("su producto esta en la bandeja " + "el costo es: " + price);
                    p2Disponible--;
                    money -= price;
                } else {
                    System.out.println("perdio,parcero");
                } break;
            }
            case 3:{
                if (p3Disponible > 0 && money >= price){
                    System.out.println("su producto esta en la bandeja " + "el costo es: " + price);
                    p2Disponible--;
                    money -= price;
                } else {
                    System.out.println("perdio,parcero");
                } break;
            }
        }
    }
}


