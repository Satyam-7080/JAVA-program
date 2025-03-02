import java.util.Scanner;

public class _6Swap_Two_numbers {
    public static void main(String[] args){
    System.out.print("Enter Two numbers for swapping to each other: ");
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    System.out.println("before swap: "+a +" and "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping : "+a+" and "+b); 
    }
}
