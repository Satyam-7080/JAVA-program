import java.util.Scanner;
public class _11Compound_Interest {
    public static void main(String[] args)
    {
        System.out.println("Find the Compound Interest..");

        System.out.print("\nPlease enter the principal amount: Rs");
        Scanner input = new Scanner(System.in);
        long principal = input.nextLong();

        System.out.print("Please enter the Rate(annul) of interest: ");
        float rate = input.nextFloat();

        System.out.print("Please enter the time period in years: ");
        int time = input.nextInt();

        double compInt = principal * Math.pow((1 + rate/100),time);
        
        System.out.println("\nCompound Interest is: Rs " + compInt);
    }
}
