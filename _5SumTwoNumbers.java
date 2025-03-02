import java.util.Scanner;
public class _5SumTwoNumbers
{
    public static void main(String[] args)
    {
        System.out.print("Enter first number: ");
        Scanner first= new Scanner(System.in);
        int num1=first.nextInt();
        System.out.print("Enter second number: ");
        int num2=first.nextInt();
        int sum= num1+num2;
        System.out.print("The result of sum: "+ sum);

    }
}