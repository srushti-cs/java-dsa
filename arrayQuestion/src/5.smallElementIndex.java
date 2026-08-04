import java.util.Arrays;

class smallElementIndex {
     static void main(String[] args) {
         int[] arr = {12, 7, 25, 4, 18, 7, 30};
//         Arrays.sort(arr);
//         System.out.println("the smallest element is:"+ arr[0]);
         int min=arr[0];
        // int index=0;
         for(int i=0;i<arr.length;i++)
         {
             if(min>arr[i])
             {
                 min=arr[i];
                // index=i;
             }
         }
         System.out.println("the smallest element is:" + min);
         int index=min;
         for(int i=0;i<arr.length;i++)
         {
             if(index==arr[i])
             {
                 index=i;
                 break;
             }
         }
         System.out.println("the index of smallest element is: " +index);
     }
}
