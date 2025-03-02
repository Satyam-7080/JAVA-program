import java.util.Scanner;
public class _8PerimeterOfRectangle {
    public static void main(String[] args)
    {
        System.out.println("Find the Perimeter of Rectangle: ");
        System.out.print("Please enter the length(cm) of rectagle: ");
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        System.out.print("Please enter the breadth(cm) of Rectangle: ");
        float breadth =sc.nextFloat();
        float perimeter = 2*(length+breadth);
        System.out.println("Perimeter(cm) of Rectangle: "+perimeter);
    }                
}
