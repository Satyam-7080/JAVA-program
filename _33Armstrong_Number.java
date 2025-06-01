import java.util.Scanner;
public class _33Armstrong_Number {
    public static void main(String[] args){
        System.out.println("Welcome to check number is Armstrong are not ");
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean armstrong = armstrong(num);
        if (armstrong){
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not Armstrong number");
        }
    }
    public static boolean armstrong(int num){
        int digits = noOfDigit(num);
        int numCopy = num;
        int finalNum = 0;
        while(num > 0){
            int rem =num % 10;
            num /= 10;
            finalNum += (int) pow(rem, digits);
        }
       
        return finalNum == numCopy;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit;
        }
    
}
