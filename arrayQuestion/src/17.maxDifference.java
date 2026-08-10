 class maxDifference {
     static void main(String[] args) {
         int[] arr ={2, 3, 10, 6, 4, 8, 1};
         int max_diff = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {

                     int diff = arr[j]-arr[i];
                     if(diff>max_diff)
                     {
                         max_diff=diff;
                     }

             }
         }
             System.out.println("the maximum differnce is:" +max_diff);

     }
}
