package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // brute force approach
    static int[] twoSUM(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //using Hashmap
    static int [] twosum(int [] arr, int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining=target-arr[i];
            if (map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] arr={7,11,12,5,55};
        int target=9;
        System.out.println(Arrays.toString(twoSUM(arr,target)));
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
}
