package Array;

public class RotateArrayKth {
    public static void reverse(int [] num,int start,int end){
        while(start<=end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int k=3;
        k=k%num.length;
        //right shift by k
        reverse(num,0,num.length-1);
        reverse(num,0,k);
        reverse(num,k+1, num.length-1);

        for (int i:num){
            System.out.print(i+"\t");
        }
    }
}
