// This  program is create a password by using Do-While loop under 6-12 charasters

import java.util.Scanner;
  public class _42Password_Checker_Using_do_whileLoop {
    
    //main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check your valid password.");
        String password;

        //Do-while loop

        do{
            System.out.println("Password must be 6-12 characters long");
            System.out.print("Please enter your password: ");
         password = input.next();
         System.out.println("Thanks, Your password is good.. and don't forget it.");
        } while(!validPass(password));
    }

//Method of boolean expression

      public static boolean validPass(String password){
        return password.length() >= 6 && password.length() <=12;
       }
}
