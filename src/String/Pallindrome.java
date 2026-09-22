package String;

public class Pallindrome {
    // two pointer approach
    static boolean checkPallindrom(String str){
        int l=0;
        int r=str.length()-1;
        while (l<r){
            if (str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    // check reverse
    static boolean pallindrome(String str){
        if (str.equals(Reverse.reverse(str))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str="abba";
        System.out.println(pallindrome(str));
        System.out.println(checkPallindrom(str));
    }
}
