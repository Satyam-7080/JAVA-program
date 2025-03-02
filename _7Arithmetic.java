import java.util.Scanner;
public class _7Arithmetic {
    public static void main(String[] args)
    {
        System.out.println("Arithmetic Calculator..");
        System.out.print("Please Enter first number: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("Please Enter second number: ");
        int b=input.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=(float)a/b;
        int rem=a%b;
        System.out.println("All arithmetic operations is: ");
        System.out.println("Additon :"+sum +"\nSubtration: "+sub+"\nMultiplication: "+mul);
        System.out.println("Division: "+div+"\nReminder: "+rem);
    }
}

