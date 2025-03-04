import java.util.Scanner;
public class _13Check_Numbers_Negative_Or_Positive_Or_Zero {
    public static void main(String[] args)
    {
        System.out.println("Check the number are positive, negative or zero.");
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        
        if (num > 0) {
            System.out.println(num + " is a positive number. ");
        }
        else if (num == 0) {
            System.out.println(num + " is a zero. ");
        }
        else {
            System.out.println(num + " is a negative number. ");
        }

    }
}
