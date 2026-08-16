import java.util.Scanner;

public class arthmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double a = input.nextDouble();

        System.out.print("Enter the second number : ");
        double b = input.nextDouble();

        System.out.println("Enter which operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

        int k = input.nextInt();

        switch (k) {

            case 1:
                Sum s = new Sum();
                System.out.println("The sum is : " + s.addition(a, b));
                break;

            case 2:
                Difference dif = new Difference();
                System.out.println("The difference is : " + dif.diff(a, b));
                break;

            case 3:
                Product pr = new Product();
                System.out.println("The product is : " + pr.mult(a, b));
                break;

            case 4:
                Division div = new Division();
                System.out.println("The division is : " + div.divide(a, b));
                break;


            default:
                System.out.println("Invalid Choice");
        }

        input.close();
    }
}