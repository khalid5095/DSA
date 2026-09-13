package Exception;

public class MultipleCatchBlock {
    public static void main(String[] args) {
    try{
    int [] arr={1,2,3};
    int res=arr[6];
    int dev=10/0;
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }finally {
        System.out.println("This will always execute");
    }
        System.out.println("Done");
    }
}
