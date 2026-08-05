import java.util.Arrays;

class arrrayReverse {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,60,70,80,90,100};

        //THIS IS THE LOGIC
//        int temp=arr[0];
//        arr[0]=arr[4];
//        arr[4]=temp;
//        temp = arr[1];
//        arr[1]=arr[3];
//        arr[3]=temp;
//        System.out.println(Arrays.toString(arr));

        int left=0;
        int right =arr.length-1;
        while(left<right)

        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
