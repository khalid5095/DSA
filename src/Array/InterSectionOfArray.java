package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterSectionOfArray {
    // two pointer brut force=>array need to be sorted
    static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        List<Integer> res=new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                    res.add(arr1[i]);
                    i++;
                    j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        System.out.println(res);
    }
    // brute force
    public static void interSection(int [] arr1,int [] arr2){
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (!visited[j] && arr1[i] == arr2[j]) {
                    res.add(arr1[i]);
                    visited[j] = true;
                    break;
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[]arr1 = {1,2,6,3,4};
        int[]arr2 = {5,6,1};
       // interSection(arr1,arr2);
        intersection(arr1,arr2);
    }
}
