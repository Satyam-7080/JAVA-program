import java.util.Scanner;

public class _16Check_Leap_Year {
    public static void main(String[] args)
    {
        System.out.println("Check the year is leap or not - ");
        System.out.print("Please enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0)
        {
            System.out.println(year + " is a leap year");
        }
       else if (year % 100 == 0)
        {
            System.out.println(year + " is not a leap year");
        }
        else if (year % 4 == 0)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }

    }
}
