import java.util.Scanner;
public class _14Check_Even_Or_Odd {
    public static void main(String[] args )
    {
        System.out.println("Welcome in checking number Even or Odd - ");
        System.out.print("Please entar the number: ");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        if (num % 2 == 0)
        {
            System.out.println(num + " is even number.");
        }
        else 
        {
            System.out.println(num + " is odd number.");
        }
    }
}
