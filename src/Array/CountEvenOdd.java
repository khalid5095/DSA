package Array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] nums={12,15,2,77,8,5,6};
        int even=0;
        int odd=0;
        System.out.println("Even numbers are:");
        for (int i:nums){
            if (i%2==0) {
                System.out.println(i+"\t");
                even++;
            }
        }
        System.out.println("Odd numbers are:");
        for (int i:nums){
            if (i%2!=0) {
                System.out.println(i+"\t");
                odd++;
            }
        }
        System.out.println("Total Even numbers: "+even);
        System.out.println("Total Odd numbers: "+odd);
    }
    }

