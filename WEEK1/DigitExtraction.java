import java.util.Scanner;

public class DigitExtraction {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Digits of the number are:");

        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }

        input.close();
    }
}

