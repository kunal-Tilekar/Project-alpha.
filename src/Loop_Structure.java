import java.util.Scanner;
public class Loop_Structure {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural positive integer: ");
        int num1 = sc.nextInt();

        if(num1<=0){
            System.out.println("Please enter a number more than or equal to 1!");
        }

        else {


            int result = 0;

            for (int i = 0; i <= num1; i++) {

                result = result + i;
            }

            System.out.println("The addition of 1 to " + num1 + " is " + result);

            int check = (num1 * (num1 + 1) / 2);

            System.out.println("Mathematical check: " + check);

        }

    }
}
