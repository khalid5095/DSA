package Array;

import java.security.spec.RSAOtherPrimeInfo;

public class FindMissing {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,6};
        /*for (int i=0;i<nums.length;i++){
            if (nums[i]!= i+1){
                System.out.println("missing: "+(i+1));
                return;
            }*/
        // using sum formula
        int n=nums.length+1;   //because 1 number is missing
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for (int num :nums){
            actualSum+=num;
        }
        System.out.println("Missing: "+(expectedSum-actualSum));
    }
}
