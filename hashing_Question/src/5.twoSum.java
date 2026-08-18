import java.util.HashMap;

class twoSum {
     static void main(String[] args) {
         int[] arr = {5, 8, 4, 7};
         int target = 9;
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<arr.length;i++)
         {
             int needed = target - arr[i];
             if(map.containsKey(needed))
             {
                 System.out.println("pair is found " + arr[i] +" "+ needed);
             }
             else
             {
                 map.put(arr[i],i);
             }
         }
     }
}
