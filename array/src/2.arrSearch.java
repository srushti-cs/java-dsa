import java.util.Scanner;

class arrSearch {
     static void main(String[] args) {
         int[] myarr= {11,22,45,33,65,78,98,76,58,90};
         Scanner input=new Scanner(System.in);
         System.out.println("ENTER THE NUMBER YOU WANT TO SEARCH: ");
         int num = input.nextInt();
         int index =0;
         while(index<myarr.length) {
             if (myarr[index] == num) {
                 System.out.println(num + " is present in the array at position " + index + "index");
                 break;

             }
             index++;//HERE THE VALUE OF INDEX IS CHANGES AND WHILE CHECHING THE OTHER IF STATEMENT THE VALUE OF INDEX IS NOT ZERO BUT THE VALUE IS UPDATED ONE....
         }
            if(index== myarr.length)
            {
               System.out.println("number is not present in the arrray...");
             }

         }
}

