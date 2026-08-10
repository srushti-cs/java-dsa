import java.util.Arrays;

class bubbleSort {
     static void main(String[] args) {
         int[] arr = {12,3,87,5,66,2,10};
         boolean swap;
         for(int i=0;i<arr.length-1;i++)
         {
             swap = false;
             for(int j=0;j<arr.length-1;j++)
             {
                 if (arr[j] > arr[j + 1])
                 {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1]=temp;
                     swap = true;
                 }

             }
             if(!swap)
             {
                 break;
             }
         }
         System.out.println(Arrays.toString(arr));
     }
}
