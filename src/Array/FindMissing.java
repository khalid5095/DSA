package Array;

import java.util.HashMap;
import java.util.HashSet;

public class FindMissing {
    //find missing number between 1-n
    static void findMissing(int []arr){
        int n=arr.length+1;
        int actualsum=n*(n+1)/2;
        int expectedSum=0;
        for (int i=0; i<arr.length; i++){
            expectedSum+=arr[i];
        }
        System.out.println("Missing: "+(actualsum-expectedSum));
    }
    //uning hashMap
    static void missing(int [] arr){
        int n=arr.length+1;
        HashSet<Integer> h=new HashSet<>();
        // add all element in array
        for (int i=0; i<arr.length;i++){
            h.add(arr[i]);
        }
        // check from 1-n
        for (int i=1; i<=n;i++){
            if (!h.contains(i)){
                System.out.println("Missing: "+i);
                break;
            }
        }
    }
    // using xor
    static int findMissingXor(int [] arr){
        int n=arr.length+1;
        int xor=0;
        // xor of all element from 1-n
        for (int i=1; i<=n; i++){
            xor=xor^i;
        }
        // xor ^ arr[i]
        for (int i=0; i<arr.length; i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,5,6};
        findMissing(arr);
        missing(arr);
        System.out.println("Missing: "+findMissingXor(arr));
    }
}
