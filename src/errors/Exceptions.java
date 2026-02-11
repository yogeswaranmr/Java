package errors;

public class Exceptions {
    static void main() {
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("catch block executed!");
        }finally {
            System.out.println("try-catch executed successsfully");
        }
    }
}
