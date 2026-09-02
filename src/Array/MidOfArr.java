package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MidOfArr {
    static double mediun(int [] arr){
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int mid=arr.length/2;
        if(arr.length%2!=0){
            return arr[mid];
        }else {
            return ((double) arr[mid-1]+arr[mid])/2;
        }
    }

    public static void main(String[] args) {
        int [] arr={14,144,15,116};
        System.out.println(mediun(arr));
    }
}
