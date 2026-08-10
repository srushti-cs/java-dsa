 class pairSum {
     static void main(String[] args) {
         int[] arr={0,2,3,1};
         int target =9;
         for(int i=0;i<arr.length;i++)
         {
             for(int j= i+1;j<arr.length;j++)

             {
                 if(arr[i]+arr[j]==target)
                 {
                     System.out.println("pair found "+arr[i]+" and "+arr[j]);
                     break;
                 }
             }
         }
         System.out.println(arr.length);
         System.out.println(arr.length-1);
         System.out.println(arr[arr.length-1]);
     }
}
