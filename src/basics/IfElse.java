package basics;

public class IfElse {
    public static void main(String[] args){
        int a = 0;

        // if - else if - else
        if(a==0){
            System.out.println("Zero");
        }
        else if(a>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        // ternary
        String result = (a==0)? "zero" : "Not zero";
        System.out.println(result);

        // nested ternary
        String result2 = (a==0)? "zero" : (a>0)? "positive" : "negative";
        System.out.println(result2);
    }
}
