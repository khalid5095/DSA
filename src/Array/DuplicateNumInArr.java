package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumInArr {
    // using frequecy
    static void frequency(int [] arr){
        int [] fre=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            fre[arr[i]]++;
        }
        for (int i=0;i<fre.length; i++){
            if (fre[i]>1){
                System.out.println("Duplicate: "+i);
            }
        }
    }
    public static void findDuplicateHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])){
                System.out.println("duplicate found: "+arr[i]);
            }
        }
    }
    //nested approach
    public static void findDuplicate(int[] arr) {
        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate found: "+arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,3,5,2};
       findDuplicateHashSet(arr);
       frequency(arr);
    }
}
