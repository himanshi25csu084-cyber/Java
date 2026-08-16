import java.util.Scanner;

public class SI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);

        input.close();
    }
}

