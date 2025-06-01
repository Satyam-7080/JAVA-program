import java.util.Scanner;
public class _37Sorted_Array{
    public static void main(String[] args){
        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the Element of "+(i+1)+" position: ");
            arr[i]=input.nextInt();
            i++;
        }
        boolean increase = increasing(arr);
        boolean decrease = decreasing(arr);
        if(increase || decrease){
        System.out.print("your array is sorted.");
        } else {
        System.out.print("your array is not sorted.");
    }
} 
    
public static boolean increasing(int[] arr){
    int i = 1;
    while(i<arr.length){
        if(arr[i] < arr[i-1]){
            return false;
        }
        i++;
    }
    return true;
}

public static boolean decreasing(int[] arr){
     int i = 1;
    while(i<arr.length){
        if(arr[i] > arr[i-1]){
            return false;
        }
        i++;
    }
    return true;
    }
}