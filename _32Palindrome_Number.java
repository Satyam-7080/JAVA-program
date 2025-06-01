import java.util.Scanner; 
public class _32Palindrome_Number {
    public static void main(String[] args){
        System.out.println("Welcome to check the Palindrome number ");
        System.out.print("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = palindrome(num);
        if(result == 1){
        System.out.println(num + " is a Palindrome number.");
        }else {
            System.out.println(num + " is not a Palindrome number.");
        }
    }

    public static int palindrome(int num){
        int number = num,result=0;
        while(num > 0){
            result = (result * 10 )+ num % 10;
        num /= 10;
        }
        if(result == number){
            return 1;
        } else {
            return 0;
        }

    }
}
