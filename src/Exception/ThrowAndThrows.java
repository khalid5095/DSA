package Exception;

public class ThrowAndThrows {
   static void checkAge(int age) throws ArithmeticException {
        if (age < 0) {
            throw new ArithmeticException("Invalid age");
        }
    }

    public static void main(String[] args) {
       try{
        checkAge(-9);
    }catch (ArithmeticException e){
       System.out.println(e.getMessage());}
    }
}
