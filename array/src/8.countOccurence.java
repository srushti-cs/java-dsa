import java.util.Scanner;
import java.util.Arrays;

class countOccurence {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = input.nextInt();
        }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         System.out.println();
        System.out.println(Arrays.toString(arr));

       int count = 0;
        System.out.println("enter the number you want search: ");
        int target = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                count++;
                // continue;
            }
        }
        System.out.println("the number is occured in the array " + count + " times.");


        //FIRST OCCURENCE
        int[] array = {10, 20, 30, 20, 40, 20};
        int targ = 20;
        for (int i = 0; i < array.length; i++) {
            if (targ == array[i]) {
                System.out.println("element is first occured at index position: " + i);
                break;
            }
        }

        //LAST OCCURENCE
        int last=-1;//because index start from 0;
        for (int i = 0; i < array.length; i++) {
            if (targ == array[i]) {
                last=i;
                continue;
            }
            //System.out.println("the last element occured at index position:" + i);
        }
        System.out.println("the last element occured at index position:" + last);


    }
}
