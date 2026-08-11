package LeetCode;

public class Sqrt_69 {
    static int sqrt(int x) {
        //binary search
        if (x<2){
            return x;
        }
        int l=1;
        int h=x;
        int ans=0;
        while (l<=h){
            int mid=l+(h-l)/2;
            if (mid<=x/mid){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(49));
    }
}
