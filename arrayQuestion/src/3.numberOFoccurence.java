import java.util.Scanner;

class numberOFoccurence {
     static void main(String[] args) {
         System.out.println("ENTER THE SIZE OF ARRAY: ");
         Scanner input = new Scanner(System.in);
         int size = input.nextInt();
         int[] arr = new int[size];
         int count=0;
         for(int i=0;i<arr.length;i++)
         {
             System.out.println("ENTER THE ELEMENT OF INDEX POSITION " + i);
             arr[i] = input.nextInt();
         }
         for(int i=0;i<arr.length;i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
             System.out.println("ENTER THE NUMBER YOU WANT TO CHECK HOW MANY TIMES IT OCCURED: ");
             int num = input.nextInt();
             int k=0;
             while(k<arr.length) {
                 if (num == arr[k]) {
                     count++;
                 }k++;
//                 System.out.println("THE NUMBER YOU ENTERD IS OCCURED " + count + "TIMES IN ARRAY");
             }
         System.out.println("THE NUMBER YOU ENTERD IS OCCURED " + count + " TIMES IN ARRAY");
         }
     }

