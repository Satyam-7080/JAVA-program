import java.util.Scanner;

public class _15Greatest_Number_in_Three {
    public static void main(String[] args)
    {
        System.out.println("Check the number which is greatest in three numbers - ");
        System.out.print("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Now, Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Now, Enter last number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println("The greatest number is: " + num1);
        }
        else if ( num2 >= num3)
        {
            System.out.println("The greatest number is: " + num2);
        }
        else 
        {
            System.out.println("The greatest number is: " + num3);
        }
      
    } 
}
