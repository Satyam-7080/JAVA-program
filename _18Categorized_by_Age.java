import java.util.Scanner;
public class _18Categorized_by_Age {
    public static void main(String[] args)
    {
        System.out.println("Categorized a person by age - ");
        System.out.print("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        
        if (age <= 13)
        {
            System.out.println("you are a child.");
        }
        else if (age <= 20)
        {
            System.out.println("You are a Teenager.");
        }
        else if (age <= 60)
        {
            System.out.println("You are adult person.");
        }
        else 
        {
            System.out.println("You are a senior citizen");
        }
        
    }
}
