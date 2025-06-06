//Reverse Array

import java.util.Scanner;
public class _39Reverse_Array {
    // Main Method 
    public static void main(String[] args){
        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int i= 0;
        while(i<size){
            System.out.print("Enter the "+(i+1)+" position element: ");
            arr[i] = input.nextInt();
            i++;
        }

      reverseArr(arr);
      System.out.print("Reverse array is: ");
      displayArr(arr);
    }
    
    // Method of Reverse Array
 
    public static void reverseArr(int[] arr){
        int i = 0;
        while(i< arr.length/2){
            int swap = arr[i];
            arr[i] = arr[arr.length-1-i];
           arr[arr.length-1-i] = swap;
           i++;
        }
    }

    // Method of display 

    public static void displayArr(int[] arr){
        int i = 0;
        while(i<arr.length){
        System.out.print(arr[i]+" ");
        i++;
        }
        System.out.println();
    }
}
