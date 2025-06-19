//Even Odd number by using bitwise operator 

import java.util.Scanner;
public class _21Check_Even_Odd_by_Bitwise_Operator {

    //Main Mehtod 
    
    public static void main(String[] args) {
        System.out.println("Check the number is even or odd using bitwise operator: ");
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        
       // Bitwise operator ( & ) If-Else Statement
        
        if ((num & 1) == 1)
        {
            System.out.println(num + " is odd number.");
        } else
        {
            System.out.println(num + " is even number.");
        }
    }   
}
