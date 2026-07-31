 class arraytraversal {
     static void main(String[] args) {
         int[] arr = {12, 7, 25, 4, 18};
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i] +" ");
         }
         System.out.println();
         int sum=0;
         for(int i=0;i<arr.length;i++)
         {
             sum = sum +arr[i];
         }
         System.out.println("The sum of array elements is: "+ sum);
     }
 }
