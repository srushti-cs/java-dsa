 class maxElementIndex {
     static void main(String[] args) {
         int[] arr = {12, 7, 25, 4, 18, 30, 9};
         int max=arr[0];
         int index=0;
         for(int i=0;i<arr.length;i++)
         {
             if(max<arr[i])
             {
                 max=arr[i];
                 index=i;
             }
         }
         System.out.println("the maximum element is:"+max);
         System.out.println("the maximun element index position is:" + index);
     }
}
