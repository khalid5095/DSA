package String;

public class Reverse {
    static String reverse(String str){
        StringBuilder s=new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            s.append(str.charAt(i));
        }

        return s.toString();
    }
    static String reverseSwap(String name){
        char[] str=name.toCharArray();
        int s=0;
        int e=str.length-1;
        while (s<e){
            char temp=str[s];
            str[s]=str[e];
            str[e]=temp;
            s++;
            e--;
        }
        String res=new String(str);
        return res;
    }

    public static void main(String[] args) {
        String str="Khalid";
        System.out.println(reverse(str));
        System.out.println(reverseSwap(str));
    }
}
