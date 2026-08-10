
import java.util.Arrays;
import java.util.Scanner;

class finalRevision {
     static void main(String[] args) {
          System.out.println("---WELCOME TO ARRAY REVISION---");
          Scanner input = new Scanner(System.in);
          System.out.println("--MAIN PROGRAMMM--\n" +
                  "1.Traversal and Sum\n" +
                  "2.Maximum and Minimum\n" +
                  "3.Search\n" +
                  "4.Count Occurrences\n" +
                  "5.Reverse Array\n" +
                  "6.Move Zeros to End\n" +
                  "7.Left Rotation by One\n" +
                  "8.Merge Two Arrays\n" +
                  "9.Missing Number\n" +
                  "10.Pair Sum\n");
          System.out.println("ENTER THE CHOICE: ");
          int choice = input.nextInt();
          switch(choice)

          {
               case 1:
                    System.out.println("TRAVERSAL AND SUM OF ARRAY...");
                    traversal();
                    break;

               case 2:
                    System.out.println("FIND MINIMUM AND MAXIMUM ELEMENT...");
                    minmax();
                    break;

               case 3:
                    System.out.println("SEARCHING THE NUMBER IN ARRAY...");
                    search();
                    break;

               case 4:
                    System.out.println("FINDING COUNT OCCURENCE..");
                    countOccur();
                    break;

               case 5:
                    System.out.println("REVERSING THE ARRAY..");
                    reverse();
                    break;

               case 6:
                    System.out.println("MOVING ZEROS TO END...");
                    movesZeroEnd();
                    break;

               case 7:
                    System.out.println("LEFT ROTATION BY ONE ...");
                    leftRotation();
                    break;

               case 8:
                    System.out.println("MERGING TWO ARRAYS..");
                    mergeArray();
                    break;

               case 9:
                    System.out.println("FINDING MISSING NUMBER..");
                    missingNum();
                    break;

               case 10:
                    System.out.println("PAIR OF SUM..");
                    pairSum();
                    break;

               default:
                    System.out.println("invalid choice...");
                    break;
          }

     }

     static int traversal()
     {
          int[] arr = {1,2,3,4,5,6};
          int sum=0;
          for(int i=0;i<arr.length;i++)
          {
               sum=sum+arr[i];
          }
          System.out.println("The sum is : " + sum );
          System.out.println(Arrays.toString(arr));
          return sum;
     }

     static void minmax()
     {
          //THIS IS USING BUILT IN FUNCTION
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the size of array: ");
           int size = sc.nextInt();
          int[] arr = new int[size];
          for(int i=0;i<arr.length;i++)
          {
               System.out.println("enter the number yyou want to enter in the index position "+ i);
               arr[i]=sc.nextInt();
          }
          for(int i=0;i<arr.length;i++)
          {
               System.out.print(arr[i] +" ");
          }
          Arrays.sort(arr);
          System.out.println("the minimum element is: "+ arr[0]);
          System.out.println("the maximum element is: "+ arr[arr.length-1]);

          //this is using logic

          int[] array = {11,34,56,78,3,566};
          int max=array[0];
          for(int i=0;i<array.length;i++)
          {
               if(max<array[i])
               {
                    max=array[i];
               }
          }
          System.out.println("the maxmimum element is: " + max);

          int min=array[0];
          for(int i=0;i<array.length;i++)
          {
               if(min>array[i])
               {
                    min=array[i];
               }
          }
          System.out.println("the minimum element is :" + min);

     }
     static void search()
     {
          Scanner input = new Scanner(System.in);
          System.out.println("enter the you ant to search:");
          int[] arr={22,56,33,89,45};
          //System.out.println(Arrays.toString(arr));
          int target = input.nextInt();
          boolean found = false;
          int index=0;
          for(int i=0;i<arr.length;i++)
          {
               if(target==arr[i])
               {
                    found =true;
                    index=i;
                    break;
               }
          }
          if(found)
          {
               System.out.println("The number "+ target+ " is found at position: " + index);
          }
          else {
               System.out.println("The number is not found in the array...");
          }
     }

     static void countOccur()
     {
          int[] arr={1,2,4,3,2,7,2,5};
          int target =2;
          int count =0;
          for(int i=0;i<arr.length;i++)
          {
               if(target == arr[i])
               {
                    count++;
               }
          }
          System.out.println("the number occured "+ count + " times in the array.");

     }

     static void reverse()
     {
          int[] arr = {10,20,30,40,50};
          int right = 0;
          int left = arr.length-1;
          while(right<left)
          {
               int temp = arr[right];
               arr[right]=arr[left];
               arr[left]=temp;

                    right++;
                    left--;

          }
          System.out.println(Arrays.toString(arr));
     }

     static void movesZeroEnd()
     {
          int[] arr = {0,4,2,0,7,4,0,13};
          int index=0;
          for(int i=0;i<arr.length;i++)
          {
               if(arr[i]!=0)
               {
                    arr[index]=arr[i];
                    index++;
               }
          }
          while(index<arr.length)
          {
               arr[index]=0;
               index++;
          }
          System.out.println(Arrays.toString(arr));
     }

     static void leftRotation()
     {
          int[] arr={10,20,30,40,50};
          int temp = arr[0];
          for(int i=0;i<arr.length-1;i++)
          {
               arr[i] = arr[i+1];

          }
          arr[arr.length-1]=temp;
          System.out.println(Arrays.toString(arr));
     }

     static void mergeArray()
     {
          int[] a ={1,2,3};
          int[] b={4,5,6};
          int[] c = new int[a.length+b.length];
          int index=0;
          for(int i=0;i<a.length;i++)
          {
               c[index]=a[i];
               index++;
          }
          for(int i=0;i<b.length;i++)
          {
               c[index]=b[i];
               index++;
          }
          System.out.println(Arrays.toString(c));
     }
     static void missingNum()
     {
          int[] arr={1,2,4,5,6};
          int n=6;
          int actual_sum = n*(n+1)/2;
          int array_sum=0;
          for(int i=0;i<arr.length;i++)
          {
               array_sum=array_sum+arr[i];

          }
          System.out.println("Missing number is: "+ (actual_sum-array_sum));
     }

     static void pairSum()
     {
          int[] arr={2,5,7,11,2};
          int target =9;
          for(int i=0;i<arr.length;i++)
          {
               for(int j=i+1;j<arr.length;j++)
               {
                    if(target == arr[i]+arr[j])
                    {
                         System.out.println("the pair of sum is:" + arr[i] +" and " + arr[j]);

                    }
               }
          }
     }


}
