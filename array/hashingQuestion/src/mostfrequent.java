import java.util.HashMap;

class mostfrequent {
    static void main(String[] args) {
        int[] arr = {2, 5, 2, 7, 5, 2, 7, 7, 7};
        int maxCount =0;
        int maxElement = 0;

        HashMap<Integer,Integer>map = new HashMap<>();

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
        for(int key: map.keySet())
        {
            if(map.get(key)>maxCount)
            {
                maxCount=map.get(key);
                maxElement = key;
                //System.out.println("the most frequent element is " + key);
            }
            //System.out.println(key);
        }
        System.out.println("the most frequent element is " + maxElement);
    }
}
