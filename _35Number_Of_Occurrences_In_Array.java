import java.util.Scanner;
public class _35Number_Of_Occurrences_In_Array {
    public static void main(String[] args){
        System.out.println("Welcome in number occurrences ");
        System.out.print("Please enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numArr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Please enter the elements " + (i + 1)+ " : ");
            numArr[i] = input.nextInt();
            i++;
        }
        System.out.print("Please enter the number to search in array: ");
        int search = input.nextInt();
                int occurrences = occur(numArr, search);

        System.out.println("The number " + search + " occure " + occurrences + " times in the array.");
    }

    public static int occur(int[] numArr, int search){
        int count = 0, i = 0;
        while(i < numArr.length){
            if(numArr[i] == search){
                count++;
            }
            i++;
        }
        return count;
    }
}