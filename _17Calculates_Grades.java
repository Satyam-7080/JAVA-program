import java.util.Scanner;
public class _17Calculates_Grades {

    public static void main(String[] args)
    {
        System.out.println("Welcome in Calculate Grades on the basis of % - ");
        System.out.print("Please enter the percentage: ");
        Scanner input = new Scanner(System.in);
        float percentage = input.nextFloat();

        if (percentage >= 90)
        {
            System.out.println("Grade is 'A' , Great");
        } 
        else if (percentage >= 75)
        {
            System.out.print("Grade is 'B' , Good");
        } else if (percentage >= 60)
        {
         System.out.print("Grade is 'C' , Work hard");
        }
        else if (percentage >= 30)
        {
            System.out.print("Grade is 'D' , You need to seriously work hard.");
        }
        else 
        {
            System.out.print("Grade is 'F' , Sorry you failed try again next time.");
        }

    }
}