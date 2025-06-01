import java.util.Scanner;
public class _34Sum_N_Avg_Of_Array {
    public static void main(String[] args){
        System.out.println("Welcome in sum and avg of given array");
        System.out.print("Please enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Please enter the element number "+ (i+1)+ " : ");
            arr[i] = input.nextInt();
            i++;
        }
        long sum = sum(arr);
        System.out.println("Sum of the numbers is " + sum);
        double avg = avg(arr);
        System.out.println("Average of the numbers is " + avg);
    }

    public static long sum(int[] arr){
        long add = 0;
        int i = 0;
        while(i < arr.length){
            add = add +  arr[i];
            i++;
        }
        return add;
    }

    public static double avg(int[] arr){
        double sum = sum(arr);

        return (sum / arr.length);
    }
       
}
