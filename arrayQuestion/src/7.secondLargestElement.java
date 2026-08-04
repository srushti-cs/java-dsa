class secondLargestElement {
    static void main(String[] args) {
        //MYLOGIC
//        int[] arr = {12, 7, 25, 4, 18, 30, 9};
//        int max=arr[0];
//        int index=0;
//        for(int i=1;i<arr.length;i++)
//        {
//            if(max<arr[i])
//            {
//
//                max=arr[i];
//               index=i;
//            }
//        }
//        System.out.println("Largest element:" +max);
//        arr[index]=0;
//        //System.out.println(arr[0]);
//        int secmax = arr[0];
//        //System.out.println(arr[1]);
//        for(int i=1;i<arr.length;i++)
//        {
//            if(secmax<arr[i])
//            {
//                secmax=arr[i];
//            }
//        }
//        System.out.println("Second Largest element is:" +secmax);

        //GPT LOGIC
        int[] arr = {12, 7, 25, 4, 18, 30, 9};
        int max=arr[0];
        int secmax = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                secmax=max;
                max=arr[i];

            }
            else if (secmax<arr[i]) {
                secmax=arr[i];

            }
        }
        System.out.println("Largest element:" +max);
        System.out.println("Second Largest element is:" +secmax);
    }
}
