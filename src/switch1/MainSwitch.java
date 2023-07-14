package switch1;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Switch1 sw = new Switch1();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese una opcion:");
        sw.option = lector.nextInt();
        System.out.println(sw.showOption());
    }
}
