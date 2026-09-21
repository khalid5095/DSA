package Array;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateFromSorted {
    // brute force approach  O(n^2)
    static int findDuplicate(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    // if array is sorted O(n log n)
     static int findDupSortedArr(int [] arr){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
     }
     // using collection O(n)
    static int find(int []arr){
        HashSet<Integer>set=new HashSet<>();
        for (int i=0; i<arr.length; i++) {
            if (!set.add(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2,3,4,4};
        System.out.println(findDuplicate(nums));
        System.out.println(findDupSortedArr(nums));
        System.out.println(find(nums));
    }
}
