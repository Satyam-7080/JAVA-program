//Returning new Array deleting a specific element

import java.util.Scanner;
public class _38Deleting_Specific_Number_Element_In_GivenArray {
    
    //Main body
    public static void main(String[] args){

        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr= new int[size];
        int i=0;
        while(i<size){
        System.out.print("Enter the "+(i+1)+" position element of array: ");
        arr[i] = input.nextInt();
        i++;
        }
         
        System.out.print("Enter the Element which you want to delete: ");
        int search = input.nextInt();
     

     int[] newArr = deleteMethod(arr, search);
     System.out.print("Your new array: ");
     displayArr(newArr);
     
    }
   
    //Method to find occurances of elements
    public static int occur(int[] arr,int search){
        int count = 0,i=0;
        while(i<arr.length){
            if(arr[i]==search){
                count++;
            }
            i++;
        }
        return count;
    }

    //Method to delete a specific number and create a new Array after deleting6
    public static int[] deleteMethod(int[] arr,int search){
        int occ = occur(arr,search);
        System.out.println("\nWhich you want to delete number has been "+occ+" time occured in this array.");
        if(occ==0){
            return arr;
        }
        int newSize = arr.length - occ ;
        int[] newArr = new int[newSize];

        int i=0,j=0;
        while(i<arr.length){
            if(arr[i] != search){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    //Display new array after deleting a specific number 
    public static void displayArr(int[] arr){
        int i=0;
        while(i< arr.length){

        System.out.print(arr[i] + " ");
        i++;
        }
        System.out.println();
    }
}
