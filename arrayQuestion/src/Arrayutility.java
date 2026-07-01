import java.util.Scanner;

public class Arrayutility {
    public static int[] inputArray() {
        System.out.println("enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("enter the element you want to enter in the index position of" + i + "= ");
            arr[i] = input.nextInt();
            //
            // System.out.println(arr[i] + " ");
            i++;
        }
        System.out.println(arr[i] + " ");
        return arr;
    }
}




