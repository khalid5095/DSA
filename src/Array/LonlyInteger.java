package Array;

public class LonlyInteger {
    public static int lonlyInteger(int [] arr){
        int res=0;
        for(int i: arr){
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr={1,3,5,1,2,2,3};
        System.out.println(lonlyInteger(arr));
    }
}
