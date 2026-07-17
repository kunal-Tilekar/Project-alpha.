import java.util.Scanner;
public class Calculator {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("------Welcome to the calculator program------");

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter an operator:(+,-,*,/) ");
        String operator = sc.nextLine();

        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();

        switch (operator) {
            case "+" -> {
                double result = num1 + num2;
                System.out.println(num1 + " plus " + num2 + " is equal to " + result);
            }
            case "-" -> {
                double result = num1 - num2;
                System.out.println(num1 + " minus " + num2 + " is equal to " + result);

            }
            case "*" -> {
                double result = num1 * num2;
                System.out.println(num1 + " times " + num2 + " is equal to " + result);
            }
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Zero division error");
                } else {
                    double result = num1 / num2;
                    System.out.println(num1 + " divided by " + num2 + " is equal to " + result);

                }
            }
            default -> System.out.println("Please Enter a valid operator!!");

        }
        sc.close();






    }
}
