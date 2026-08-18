import java.util.HashMap;

class firstUNIque {

    static void main(String[] args) {
        int[] arr = {7, 4, 1, 9, 4, 2, 9};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==1)
            {
                System.out.println("The first unique element is " + arr[i]);
                break;
            }
        }
    }

}
