package Array;

import java.util.ArrayList;

public class UnionOfTwoArray {
    public static ArrayList<Integer> unionOfArray(int[] arr1, int[] arr2){
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                if (res.isEmpty() || res.get(res.size()-1) != arr1[i]){
                    res.add(arr1[i]);
                }
                i++;
            }
            if (arr1[i]>arr2[j]){
                if (res.isEmpty() || res.get(res.size()-1) != arr2[i]){
                    res.add(arr2[j]);
                }
                j++;
            }
            else {
               if (res.isEmpty() || res.get(res.size()-1) != arr2[i]){
                   res.add(arr1[i]);
               }
               i++;
                j++;
            }
        }
        // Copy remaining elements of arr1
        while (i < arr1.length) {

            // Add only if different from last inserted element
            if (res.get(res.size() - 1) != arr1[i]) {
                res.add(arr1[i]);
            }

            i++;
        }
        // Copy remaining elements of arr2
        while (j < arr2.length) {

            // Add only if different from last inserted element
            if (res.get(res.size() - 1) != arr2[j]) {
                res.add(arr2[j]);
            }

            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5};
        int[] arr2 = {2,3,4,4,4,4};
        System.out.println(unionOfArray(arr1,arr2));
    }
}
