import java.util.Scanner;

public class arraysort {
    static void main(String[] args) {

        System.out.println("ENTER THE SIZE OF ARRAY: " );
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("ENTER THE ELEMENT OF INDEX POSITION " + i + " = ");
            arr[i] = input.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
