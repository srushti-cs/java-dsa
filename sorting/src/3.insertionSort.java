import java.util.Arrays;

class insertionSort {
     static void main(String[] args) {
         int[] arr={3,7,5,1};
         for(int i=0;i<arr.length;i++)
         {
             int key=arr[i];
             int j=i-1;
             while(j>=0 && arr[j]>key)
             {
                 arr[j+1]=arr[j];
                 j--;
             }
             arr[j+1]=key;
         }
         System.out.println(Arrays.toString(arr));
     }
}
