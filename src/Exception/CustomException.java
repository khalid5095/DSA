package Exception;

public class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
    static void checkAge(int age)throws CustomException{
        if(age<18){
            throw new CustomException("this is is not valid age for voting");
        }else {
            System.out.println("Age is not Valid");
        }
    }

    public static void main(String[] args) {
        try{
        checkAge(17);
    }catch(CustomException e){
        System.out.println(e.getMessage());}
    }
}
