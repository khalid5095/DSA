package Array;

public class MoveZeroEnd {
    //using another array
    static void moveZeroUsingAnotherArray(int[]arr){
        int [] res=new int[arr.length];
        int j=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                res[j]=arr[i];
                j++;
            }
        }
        for (int i :res){
            System.out.print(i+"\t");
        }
    }
    //using two pointer
    static void moveZero(int[]arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,3,6,0,7};
       // moveZeroUsingAnotherArray(arr);
        moveZero(arr);
        for (int i: arr){
            System.out.print(i+"\t");
        }

    }
}
