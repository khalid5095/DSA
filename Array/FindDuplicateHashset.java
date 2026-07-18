package Backend.DSA.Array;

import java.util.HashSet;

public class FindDuplicateHashset {
    public static void findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int n :  arr){
            if (set.contains(n)){
                System.out.println("Duplicate number is: "+ n);
                return;
            }
            set.add(n);
        }
        System.out.println("No duplicate found");
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,3,5,2};
        findDuplicate(arr);
    }
}
