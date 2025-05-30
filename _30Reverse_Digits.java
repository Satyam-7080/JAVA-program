import java.util.Scanner;
public class _30Reverse_Digits {
    public static void main(String[] args){
        System.out.println("Welcome in Satyam's program - ");
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of " + num + " is " + reverse);
    }

    public static int reverse(int num){
        int reverse = 0;
        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /=10;
        }
        return reverse;
    }
}
