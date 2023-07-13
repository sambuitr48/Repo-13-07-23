package mult;

public class PrincipalMult {
    public static void main(String[] args) {
        Multiplication mtl = new Multiplication();
        mtl.multnumber1 = 500;
        mtl.multnumber2 = 200;
        System.out.println("The multiplication of the numbers is: " + mtl.multiply());
    }
}
