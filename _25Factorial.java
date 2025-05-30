import java.util.Scanner;
public class _25Factorial {
    public static void main(String[] args){
        System.out.println("Welcome in calculator for facorial - ");
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter the number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }   

    public static long factorial(int num){
        long fact = 1;
        int i = 1;
        if(num > 0){

            while (i <= num) {
               fact *= i;
               i++;
            }
        } else
        {
            System.out.println("Factorial is not defined for less than 1 numbers so below's answer is wrong.");
        }
        return fact;
    }
}