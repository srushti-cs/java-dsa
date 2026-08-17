import java.util.HashMap;

class hashMap {
    static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2};
        HashMap<Integer, Integer>map=new HashMap<>();


        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {

                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);



    }

}
