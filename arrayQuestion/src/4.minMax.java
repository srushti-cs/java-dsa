import java.util.Scanner;

class minMax {
     static void main(String[] args) {
         System.out.println("ENTER THE SIZE OF ARRAY: ");
         Scanner input = new Scanner(System.in);
         int size = input.nextInt();
         int[] arr = new int[size];
         //int min =arr[0];
         int max=0;
         for(int i=0;i<arr.length;i++)
         {
             System.out.println("ENTER THE ELEMENT OF INDEX POSITION " + i);
             arr[i] = input.nextInt();
         }
         for(int i=0;i< arr.length;i++)
         {
             System.out.print(arr[i] + " ");
         }
         int k=0;
         System.out.println();
         while(k<arr.length)
         {
             if(arr[k]>max)
             {
                 max=arr[k];
             }
             //System.out.println(max);
             k++;
         }
         System.out.println("the maximum number is : " + max);
         int l=0;
         //int min=0;
         int min = arr[0];
         while(l<arr.length)
         {
             if(arr[l]<min)
             {
                 min=arr[l];
             }
             l++;
         }
         System.out.println("the minimum number in the array is :" + min);
     }
}
