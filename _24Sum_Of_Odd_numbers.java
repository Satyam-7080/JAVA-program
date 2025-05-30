import java.util.Scanner;
public class _24Sum_Of_Odd_numbers {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome in sum of odd numbers - ");
        System.out.print("\nPlease enter the number: ");
        int num = input.nextInt();
        int sum = sumOfOdd(num);
        System.out.println("The sum of odd numbers till " + num + " is " + sum);
    }

    public static int sumOfOdd(int num){
        int sum = 0;
        int i = 1;
        while (i <= num)
        {
            sum += i;
            i += 2;
        }
       return sum;

    }
}
