package Array;

public class MaxSum {
    static int maxSum(int [] arr){
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    //Kadene's Algorithm
    static int maxSumKadanes(int [] arr){
        int maxSum=arr[0];
        int currentSum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum=Math.max(arr[i],arr[i]+currentSum);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] arr={-1,2,3,-6,5,4};
        // System.out.println(maxSum(arr));
        System.out.println(maxSumKadanes(arr));
    }
}
