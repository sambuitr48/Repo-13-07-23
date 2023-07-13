package suma;

public class PrincipalSum {
    public static void main(String[] args) {
        Sum plus = new Sum();
        plus.number1 = 35;
        plus.number2 = 45;
        System.out.println("The sum of the numbers is: " + plus.plus());
    }
}
