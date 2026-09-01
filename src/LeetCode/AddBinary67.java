package LeetCode;

public class AddBinary67 {
    public static String addBinary1(String a, String b) {
            int c=Integer.parseInt(a,2);
            int d=Integer.parseInt(b,2);
            int sum=c+d;
        return   Integer.toBinaryString(sum);
    }
    public static String addBinary2(String a, String b) {
        StringBuilder res=new StringBuilder();
        int i=a.length()-1; //last element
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0 || carry!=0){
            int sum=carry;
            if (i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if (j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            res.append(sum%2);
            carry=sum/2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary1("11","1"));
        System.out.println(addBinary2("11","1"));
    }
}
