package Exception;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        try{ int age=sc.nextInt();
            if (age>=18){
                System.out.println("Eligible to Vote...");
            }else {
                System.out.println("Not Eligible to Vote...");
            }
            return;
        } catch (Exception e) {
            System.out.println("Enter a valid age");
            return;
        }
        finally {
            System.out.println("this will always execute");
        }
    }
}
