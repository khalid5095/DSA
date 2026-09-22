package String;

public class FirstNonRepeatingChar {
    static char fnrc(String  str){
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str="aabbcc";
        System.out.println(fnrc(str));
    }
}
