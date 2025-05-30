import java.util.Scanner;

public class _22While_Loop {
    public static void main(String[] args)
    {
        System.out.println("Welcome in while loop -");
        System.out.print("Please enter the number whereas you want print: ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int i = 1; //Initialization
        
        while (i <= n){  //condition
            System.out.print(i + " ");
            i++; //Incrementation
        }
    }
}
