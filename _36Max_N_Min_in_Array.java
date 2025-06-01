import java.util.Scanner;
public class _36Max_N_Min_in_Array {
    public static void main(String[] args){
        System.out.println("Welcome calculate max & min in array");
        System.out.print("Please enter the number of element: ");
        Scanner input = new Scanner (System.in);
        int size = input.nextInt();
        int[] numArr = new int[size];
        int i=0;
        while(i < size){
            System.out.print("Please enter the element of arrar "+ (i+1) + " : " );
            numArr[i] = input.nextInt();
            i++;
        }
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Maximum element of array is "+ max);
        System.out.println("Minimum element of array is "+ min);

    }



    public static int max(int[] numArr){
       if(numArr.length == 0){
        return Integer.MIN_VALUE;
       }
       int max = numArr[0];
       int i=1;
       while(i < numArr.length){
        if(max < numArr[i]){
            max = numArr[i];
        }
        i++;
       }
        return max;
    }

    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i =0;
        while(i < numArr.length){
            if(min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }
}
