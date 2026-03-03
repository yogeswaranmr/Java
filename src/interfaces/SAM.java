package interfaces;

// SAM - Single Abstract Method

@FunctionalInterface
interface MathOperation{
    int calculate(int x, int y);

    default void info(){
        System.out.println("This is an interface");
    }

    @Override
    boolean equals(Object obj);
    // If your interface explicitly declares an abstract method that
    // matches a public method in java.lang.Object (like equals, hashCode, or toString),
    // it does not count towards your limit of one!
}

class Addition implements MathOperation{
    @Override
    public int calculate(int x, int y){
        return x+y;
    }
}

public class SAM {
    static void main() {
        MathOperation additionLambda = (a, b) -> a + b;
        // to call this lambda:
        // labmdaName.functionName(params)
        System.out.println(additionLambda.calculate(2,3));

        var addObj = new Addition();
        System.out.println(addObj.calculate(2,3));
    }
}