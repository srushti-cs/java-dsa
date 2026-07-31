import java.util.Arrays;
 class arraySort {
     static void main(String[] args) {

         //TO PRINT ARRAY
       int[] arr = {22,10,3,56,33,7,93};
         System.out.println(Arrays.toString(arr));//Array.toString() is used to print array

         //TO SORT ARRAY
         int[] array = {12,34,56,78,986,4,1,3};
         Arrays.sort(array);//Array.sort() is used to sort the array and by default it is in ascending
         System.out.println("sorted array is: ");
         System.out.println(Arrays.toString(array));

         //find min max using Arrays.sort()
         System.out.println("the min element in the array : " + array[0]);
         System.out.println("the max element in the array : " + array[array.length-1]);

         //TO COMPARE TWO ARRAYS
         int[] a={1,2,3};
         int[] b={1,2,3};
         System.out.println(Arrays.equals(a,b));//Arrays.equals(arr1,arr2) is used to compare to array

         System.out.println(Arrays.equals(arr,array));

         //TO FILL THE ELEMENTS IN ARRAY
         int[] c = new int[5];
         Arrays.fill(c,10);//Arrays.fill() is used to fill the values
         System.out.println(Arrays.toString(c));

         //TO COPY ARRAY
         int[] d ={10,20,30,40};
         int[] copy = Arrays.copyOf(d ,d.length);//Arrays.copy()is used the element
         System.out.println(Arrays.toString(copy));
          int[] e={10,20,30};
          int[] f = Arrays.copyOf(e,5);//you can also extend the length
          f[3]=5;
         System.out.println(Arrays.toString(f));


     }
}
