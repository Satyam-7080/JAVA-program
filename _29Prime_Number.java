import java.util.Scanner;
public class _29Prime_Number {
    public static void main(String[] args){
        System.out.println("Welcome in checking number is prime or not: ");
        System.out.print("\nPlease enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int prime = primeNumber(num);
        if(prime == 0){
            System.out.println(num + " is a prime number."); 
        }  else 
        System.out.println(num + " is not a primme number.");
    }

    public static int primeNumber(int num){
        int prime = 0, i = 2;
        while (i < num) {
            if (num % i == 0) {
                prime = 1;
                break;
            }
            i++;
        }
        return prime;
    }
}
