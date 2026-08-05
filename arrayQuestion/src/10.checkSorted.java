class checkSorted {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean sorted =true;
        for(int i=0;i<arr.length-1;i++)
        {

                if(arr[i]>arr[i+1])
                {
                    sorted =false;
                    break;
                }

        }
        if(sorted)
        {
            System.out.println("ARRAY IS SORTED");
        }
        else {
            System.out.println("ARRAY IS NOT SORTED");
        }
    }
}
