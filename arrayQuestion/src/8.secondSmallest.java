 class secondSmallest {
     static void main(String[] args) {
         int[] arr = {12, 7, 25, 4, 18, 30, 9};
         int min=arr[0];
         int secmin=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(min>arr[i])
             {
                 secmin=min;
                 min=arr[i];
             } else if (secmin>arr[i]) {
                 secmin=arr[i];

             }
         }
         System.out.println("Smallest element:" +min);
         System.out.println("Second smallest element:"+secmin);
     }
}
