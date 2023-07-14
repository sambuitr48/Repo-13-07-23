package vendingMachine;

import java.util.Scanner;

public class MachineMain {
    public static void main(String[] args) {
        Menu compra = new Menu();
        compra.price = 5000;
        compra.p1Disponible = 2;
        compra.p2Disponible = 5;
        compra.p3Disponible = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("cuanto dinero vas a ingresar? ");
        compra.money = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escoja el producto: ");
        compra.option = scanner1.nextInt();

        compra.comprarProducto();
    }
}
/*/GRUPO DE TRABAJO: LUIS MIGUEL ALVAREZ OSORIO Y SAMUEL BUITRAGO OSORIO/*/