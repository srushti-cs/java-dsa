import java.util.HashMap;

class findTargetOccur {
    static void main(String[] args) {
       int[] arr = {2, 3, 2, 5, 3, 3};
        int target = 2;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                if (map.containsKey(target)) {
                    map.put(target, map.get(target) + 1);
                } else {
                    map.put(target, 1);
                }
            }
        }
        System.out.println(map);

    }
}

