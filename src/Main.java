//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || j==1 ||i==n || j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
            }
        }
    }