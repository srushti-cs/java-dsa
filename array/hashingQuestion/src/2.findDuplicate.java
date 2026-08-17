import java.util.HashMap;

class findDuplicate {
     static void main(String[] args) {
         int[] arr = {2, 5, 3, 2, 7, 3, 2};
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
         for(int key:map.keySet())
         {
             if(map.get(key)>1)
             {
                 System.out.println("THe duplictaes are = " + key);
             }
         }
     }
}
