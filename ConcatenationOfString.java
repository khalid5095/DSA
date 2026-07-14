package Backend.DSA;

public class ConcatenationOfString {
    //input ->  num=[1,2,1]
    //output -> result=[1,2,1,1,2,1]
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int[2*n];
        for(int i=0; i<n; i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={1,2,1};
        int[] ans=getConcatenation(nums);
        for (int i : ans) {
            System.out.print(i+"\t");
        }
    }
}
