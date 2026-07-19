package Backend.DSA.Array;

import java.util.HashSet;

public class FindAllDuplicates {
    public static void findAllDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int n : arr) {
            if (seen.contains(n)) {
                if (!duplicate.contains(n)) {
                    duplicate.add(n);
                }
            }
            seen.add(n);
        }
        if (duplicate.isEmpty()){
        System.out.println("No duplicate found");
        }
        System.out.println("Duplicate numbers");
        for (int n : duplicate) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5,4,2};
        findAllDuplicate(arr);
    }

}