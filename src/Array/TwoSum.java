package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //using Hashmap
    static void twosum(int[] arr,int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (map.containsKey(remaining)) {
                System.out.println(map.get(remaining)+" "+i);
                return;
            }
            map.put(arr[i], i);
        }
    }
    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }

                }
            }
        return new int[]{};
        }

    public static void main(String[] args) {
        int [] arr={2,7,11,12,5,4};
        int target=9;
        /*int [] res= twoSum(arr,target);
        System.out.println(Arrays.toString(res));*/
        twosum(arr,target);
    }
}
