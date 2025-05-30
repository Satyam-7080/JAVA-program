import java.util.Scanner;
public class _26Sum_Of_Digits {

    public static void main(String[] args) {
        System.out.println("Welcome in calculate for sum of digits: ");
        System.out.print("\nPlease enter the number for sum of digits: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = sumOfDigit(num); 
        System.out.println("Sum of Digits is: " + sum);    
    }

    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
           sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}