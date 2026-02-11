package methods;

public class Overloading {
    static int addNum(int i, int j){
        return i+j;
    }
    static float addNum(float i, float j){
        return i+j;
    }
    static void main() {
        int intSum = addNum(1,2);
        float floatSum = addNum(1.1f, 2.2f);
        System.out.println("intSum: "+intSum);
        System.out.println("floatSum: "+floatSum);
    }
}
