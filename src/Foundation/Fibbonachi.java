package Foundation;

public class Fibbonachi {
    static void fibbonachi(int n){
        int a=1;
        int b=1;
        for(int i=1;i<=n;i++){
           // System.out.print(a+"\t");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        fibbonachi(5);
    }
}
