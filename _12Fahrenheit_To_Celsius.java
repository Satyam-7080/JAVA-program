import java.util.Scanner;
public class _12Fahrenheit_To_Celsius {
    public static void main(String[] args)
    {
        System.out.println("Convert fahrenheit to Celsius..");
        System.out.print("Please enter the temperature in fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double fahren = sc.nextDouble();
        double celsius = (fahren-32) * 5/9;
        System.out.println(fahren + " Fahrenheit is equal to " + celsius + " Celsius");
    }
}
