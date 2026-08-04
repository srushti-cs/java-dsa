import java.util.Scanner;

class arraySerachtwo {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         //IN THIS ONE PROBLEM OCCUR IF NUM IS NOT FOUND NOTHING IS PRINT
         System.out.println("Enter the number you want to search: ");
         int[] arr = {11,23,45,67,89};
         int target = input.nextInt();//lets search this number in array
         for(int i=0;i<arr.length;i++)
         {
             if(target == arr[i])
             {
                 System.out.println(target+" is found in the array. at index position " + i);
             }
         }


         //TO SOLVE THE PROBLEM THIS METHOD IS USED
         int[] array ={11,22,34,56,47,89};
         System.out.println("Enter the number you want to search in second array :");
         int num = input.nextInt();
         boolean found = false;
         for(int i=0;i<array.length;i++)
         {
             if(num == array[i])
             {
                 found=true;
                 break;
             }
         }
         if(found==true)
         {
             System.out.println("Number is found");
         }
         else
         {
             System.out.println("Number is not found");
         }
     }
}
