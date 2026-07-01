import java.util.Scanner;

class sumAndAvg {
    static void main(String[] args) {
        System.out.println("WELCOME TO ARRAY :");
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        float sum=0;
        float avg=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the elemnet for position index = " + i);
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
            sum = sum +arr[i];
        }
        avg = sum/ arr.length;
        System.out.println();
        System.out.println("THE SUM OF THE ELEMENTS OF ARRAY IS : " + sum);
        System.out.println("THE AVERAGE OF ALL THE ELEMENTS IN THE ARRAY IS : " + avg);

    }
}
