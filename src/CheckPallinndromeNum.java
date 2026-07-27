public class CheckPallinndromeNum {
    public boolean checkPallindrome(int num){

        int n=num;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if (rev==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        CheckPallinndromeNum obj=new CheckPallinndromeNum();
        int num=123121;
        System.out.println(obj.checkPallindrome(num));
    }
}


