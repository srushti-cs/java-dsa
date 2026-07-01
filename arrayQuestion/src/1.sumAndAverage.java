 class sumAndAverage {
    //THIS IS USING WITHOUT USER INPUT SO CHECK NEXT ONE FOR USER INPUT
     static void main(String[] args) {
         System.out.println("WLECOME TO SUM AND AVERAGE");
         int[] arr = {1,2,3,4,5,6,7,8,9,10};
         float sum =0;
         float avg=0;
         for(int i=0;i<arr.length;i++)
         {
             sum= sum +arr[i];
             avg=sum/arr.length;
             //System.out.print(arr[i] + " ");
            // System.out.println(sum);
         }
         System.out.println("The sum of array element is =  " + sum);
         System.out.println("The average of array element is =  " + avg);
     }
}
