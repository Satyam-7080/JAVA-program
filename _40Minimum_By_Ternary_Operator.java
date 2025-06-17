import java.util.Scanner;
public class _40Minimum_By_Ternary_Operator{

    public static void main(String[] args){
    System.out.println("Welcome to find the minimum of two number by using ternary operator ");
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the 1st number: ");
    int num1 = input.nextInt();
    
    System.out.print("Now, Please enter the 2nd number: ");
    int num2 = input.nextInt();
    
    _40Minimum_By_Ternary_Operator miniNumber = new _40Minimum_By_Ternary_Operator();
                 
    int minimum =miniNumber.min(num1,num2);
    System.out.print("The minimum number is: "+minimum);
   
    }


    public int min(int num1,int num2){

        return num1<num2 ? num1 : num2;
    }
}