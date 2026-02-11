package oop;

public class AccessModifiers {
    private int privateData = 1;
    protected int protectedData = 2;
    int defaultData = 3;
    public int publicData = 4;

    final int finalData = 123;
    static int staticData = 1234;
}

class ExecuteAccessModifiers{
    static void main() {
        var obj = new AccessModifiers();
        System.out.println("public data: "+obj.publicData);
        System.out.println("protected data: "+obj.protectedData);
        // cannot access, obj.privateData
        System.out.println("static data: "+AccessModifiers.staticData);
        // cannot modify, obj.finalData
        System.out.println("final data: "+obj.finalData);
    }
}