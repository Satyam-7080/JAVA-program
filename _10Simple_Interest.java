import java.util.Scanner;
public class _10Simple_Interest {
    public static void main(String[] args) {
        System.out.println("Find the Simple Interest..");
        System.out.print("Please enter Principal amount: Rs");
        Scanner input=new Scanner(System.in);
        long principal=input.nextLong();
        System.out.print("Please enter Rate(annul) of Interest: ");
        float rate=input.nextFloat();
        
        System.out.print("Please enter Time(yearly) for which the interest is calculate: ");
        int time=input.nextInt();
        double interest=(principal*rate*time)/100;
        System.out.println("Simple Interest is: "+interest);
    }
}
