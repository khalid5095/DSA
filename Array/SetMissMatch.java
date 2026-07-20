package Backend.DSA.Array;

import java.util.Arrays;

public class SetMissMatch {
    public static int[] finderrornum(int[]nums){
        int[]freq=new int[nums.length+1];
        for(int num:nums){
            freq[num]++;
        }
        /*for (int i = 0; i < nums.length; i++) {
    freq[nums[i]]++;
}*/
        int duplicate=-1;
        int missing=-1;
        for (int i=0;i<freq.length;i++){
            if (freq[i]==2){
                duplicate=i;
            }else if (freq[i]==0){
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,3};
        int[]result=finderrornum(nums);
        System.out.println(Arrays.toString(result));
    }
}
