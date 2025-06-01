import java.util.Scanner;
public class _31Fibonacci_Series {
    public static void main(String[] args){
        System.out.println("welcome to Fibonacci Series ");
        System.out.print("Please enter the number whereas you want: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num){
        if(num < 0) return;
            System.out.print(" 0 ");
        if(num == 0) return;
            System.out.print("1 ");
        int first=0,second=1;
        while(first + second <= num){
            int third = first + second ;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
