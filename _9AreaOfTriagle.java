import java.util.Scanner;
public class _9AreaOfTriagle {
    public static void main(String[] args)
    {
        System.out.println("Find the area of triangle: ");
        System.out.print("Please enter the base of triangle: ");
        Scanner sc =new Scanner(System.in);
        float base=sc.nextFloat();
        System.out.println("Please enter the height of triangle: ");
        float height=sc.nextFloat();
        float area = (base*height)/2;
        System.out.println("The area of triangle is: " + area + "cm2");

    }
}
