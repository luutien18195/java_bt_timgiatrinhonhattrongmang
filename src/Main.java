import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt(), element;

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("\narr[" + i + "]: ");
            element = scanner.nextInt();
            array[i] = element;
        }

        display(array);

        System.out.println("\nMin of array is " + findMin(array));

    }

    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print( "\n"+arr[i] + " ");
        }
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
           if(min>arr[i]){
               min=arr[i];
           }
        }
        return min;
    }
}
