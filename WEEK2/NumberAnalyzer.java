import java.util.Scanner;
public class NumberAnalyzer {
    static int ReadNumber(Scanner input){
        System.out.print("Enter the number :");
        return input.nextInt();
    }
    static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
    static boolean isPositive(int number){
        if(number>0){
            return true;
        }
        return false;
    }
     static int absoluteValue(int number){
        if(number>0){
            return number;
        }
        number = number - (2*number);
        return number;
     }
    static int countDigits(int number){
        int count =0;
        while(number>0){
            number /=10;
            count++;
        }
        return count;
    }
    static int sumDigits(int number){
        int sm=0;
        while(number>0){
            sm += number%10;
            number=number/10;
        }
        return sm;
    }
    static void analyzeMagnitude(int number){
        System.out.println("The absolute value is : "+absoluteValue(number));
        System.out.println("Number of digits are : "+countDigits(number));

    }
    static void printReport(
                        int number,
                        boolean even,
                        boolean positive,
                        int digitCount,
                        int digitSum){
                            System.out.println("The number is : "+number);
                            System.out.println("Is the number even ? : "+even);
                            System.out.println("Is the number positive ? : "+positive);
                            System.out.println("The number of digits are : "+digitCount);
                            System.out.println("The Sum of the digits are : "+digitSum);
                        }
    public static void main(String a[]){
        Scanner scan  = new Scanner(System.in);
        int number =  ReadNumber(scan);
        boolean even = isEven(number);
        boolean pos = isPositive(number);
        int abvalue = absoluteValue(number);
        int digits = countDigits(number);
        int sum_digits = sumDigits(number);
        printReport(number, even, pos, digits, sum_digits);
        analyzeMagnitude(number);
        scan.close();


    }
    
}
