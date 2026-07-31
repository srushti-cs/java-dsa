import java.util.Scanner;

class revise {
    static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println("enter the number you want in index = " + i);
//            arr[i] = input.nextInt();
////            System.out.print(arr[i] + " ");
//        }
//
//        //NORMAL FOR LOOP
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        //FOR EACH LOOP
//        int[] array = {10,20,30};
//        for(int x:array)
//        {
//            System.out.print(x + " ");
//        }
        //DIFFERENCE BETWEEN FOR LOOP GIVES INDEX AND EACH FOR LOOP GIVES DIRECT VALUES


////ARRAY TRAVERSAL AND SUM OF ELEMENTS
//        int[] arr = {12, 7, 25, 4, 18};
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i] +" ");
//        }
//        System.out.println();
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            sum = sum +arr[i];
//        }
//        System.out.println("The sum of array elements is: "+ sum);

        //find min and max element
        int[] arr = {12, 7, 25, 4, 18};
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
            //System.out.println(max);
        }
        System.out.println("the minimun element is "+ min);
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
            //System.out.println(max);
        }
        System.out.println("the maximum element is "+ max);


    }
}
