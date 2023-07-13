package rest;

public class PrincipalRest {
    public static void main(String[] args) {
        Subtraction rest = new Subtraction();
        rest.restnumber1 = 50;
        rest.restnumber2 = 44;
        System.out.println("The rest of the numbers is: " + rest.sub());
    }
}
