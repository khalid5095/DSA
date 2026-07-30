package Array;

public class FindSecondSmallest {
    public static void main(String[] args) {
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MIN_VALUE;
        int [] num={4,3,-1,7,9,-5};
        for (int i=0; i<num.length; i++){
            if (num[i]<smallest){
                secondSmallest=smallest;
                smallest=num[i];
            }else if (num[i]<secondSmallest && num[i]!=secondSmallest){
                secondSmallest=num[i];
            }
        }
        System.out.println("Smallest number : "+smallest);
        System.out.println("second smallest : "+secondSmallest);
    }
}
