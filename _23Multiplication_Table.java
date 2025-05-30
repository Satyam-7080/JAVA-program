import java.util.Scanner;

public class _23Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in multiplication Table - ");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        table(num);
    }
    public static void table(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
    }

}
