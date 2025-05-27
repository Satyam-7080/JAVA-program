import java.util.Scanner;
public class _19Bitwise_operators {
    public static void main(String[] args)
    {
        System.out.println("Welcome in Operatins of bitwise - ");
        System.out.print("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        
        int result = num1 & num2;
        System.out.println("\nBitwise AND operation's result is " + result);

        int or = num1 | num2;
        System.out.println("\nBitwise OR operation's result is " + or);

        int xor = num1 ^ num2 ;
        System.out.println("\nBitwise XOR operation's result is " + xor);

       
    }
}
