 class findDuplicate {
     static void main(String[] args) {
         int[] arr = {10, 20, 60, 30, 40,60,200};
         boolean found=false;
         for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[i]==arr[j])
                 {
                    System.out.println("Duplicate is found and the duplicates is :"+arr[i]+" "+arr[j]);
                     found=true;
                     break;
                 }
             }
         }
         if(!found)
         {
            System.out.println("Dupicate is not found ");

         }

     }
}
