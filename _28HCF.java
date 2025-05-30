import java.util.Scanner;
public class _28HCF {
    public static void main(String[] args){
        System.out.println("Welcome to find HCF or GCD -");
        System.out.print("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Now, enter second number: ");
        int num2 = input.nextInt();
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is "+ hcf);
    }

    public static int findHCF(int num1, int num2){
        int fact = 1, i = 2;
        int least = least(num1 , num2);
        while(i <=least){
            if(num1 % i == 0 && num2 % i == 0){
                fact = i;
            } 
            i++;
        }
        return fact;
        }
     public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        } else {
            return num2;
        }

     }

    
}
