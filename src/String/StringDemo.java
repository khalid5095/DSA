package String;

public class StringDemo {
    public static void main(String[] args) {
        String s1=new String("Java");
        String s2="Java";
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode()==s2.hashCode()); //true
        String s3=s1.intern();
        System.out.println(s3==s2);
        StringBuilder sb=new StringBuilder("Java");
        sb.insert(3,"programming");
        sb.delete(3,14);

        System.out.println(sb);
    }
}
