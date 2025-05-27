import java.util.Scanner;
public class _20Left_right_shift_bitwise {
    public static void main(String[] args) {
        System.out.println("Welcome in bitwise convertor - ");
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        int left = num << 1;
        System.out.println("\nThe left shift of " + num + " is " + left);
        
        int right = num >> 1;
        System.out.println("\nThe right shift of " + num + " is " + right);

        int not = ~num;
        System.out.println("\nBitwise NOT operation's result of " + num + " is " + not);
    }
}
