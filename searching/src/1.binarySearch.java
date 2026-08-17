 class binarySearch {
     static void main(String[] args) {
         int[] arr = {3, 7, 12, 18, 25, 31};
         int target = 18;
         int left =0;
         int right=arr.length-1;

         while(left<=right)
         {
             int mid= (left+right)/2;
             if(target==arr[mid])
             {
                 System.out.println("Element is found.." + arr[mid]);
                 break;
             }
              else if (target>arr[mid])
              {
                  left = mid +1;

         }
              else
             {
                 right = mid -1;
             }
         }
     }
}
