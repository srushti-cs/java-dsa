 class missing {
     static void main(String[] args) {
         int[] arr = {1,2,3,5,6};
         int n=6;
         int expected_sum = n*(n+1)/2;
         int array_sum=0;
         for(int i=0;i<arr.length;i++)
         {
             array_sum = array_sum+arr[i];
         }
         System.out.println("the missing number from the array is: " + (expected_sum-array_sum));
     }
}
