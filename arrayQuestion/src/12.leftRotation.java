import java.util.Arrays;

class leftRotation {
     static void main(String[] args) {
         int[] arr = {10,20,30,40,50};
         int temp = arr[arr.length-1];
         for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                 arr[i] = arr[j];
                 System.out.println("value of j" +arr[j]);
                 System.out.println("value of i"+ arr[i]);
             }
             System.out.println(arr[i]);
         }
         arr[arr.length-1]=temp;
         System.out.println(Arrays.toString(arr));
     }
}
