//This program is find the table by using for loop

import java.util.Scanner;
public class _43Multiplication_table_By_ForLoop {
    
    //Main method 

    public static void main(String[] args) {
        System.out.println("Welcome in multiplication table by using for loop");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number which you want to know table: ");

        int num = input.nextInt();
                System.out.print("Please emter the number where till you want print: ");

                int till = input.nextInt();
   
        table(num,till);   //Method calling
    }


//     method defination
    public static void table(int num,int till){

        for(int i= 1; i<=till ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
