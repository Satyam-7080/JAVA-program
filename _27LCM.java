import java.util.Scanner;
public class _27LCM {
    public static void main(String[] args){
        System.out.println("Welcome calculate LCM - ");
        System.out.print("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();
        int result = lcm(num1 , num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + result);
    }

    public static int lcm(int num1,int num2){
       
       int i = 1;
       while(true){
         int fact = num1 * i;
         if(fact % num2 == 0){
            return fact;
         } 
            i++;
        }
    }
           
    
}
