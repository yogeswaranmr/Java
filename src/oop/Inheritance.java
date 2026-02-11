package oop;

class A{
    A(){
        System.out.println("A constructor called");
    }
}

class B{
    B(){
        System.out.println("B constructor called");
    }
}

// inheritance using extends keyword
// C inherits A
class C extends A{
    C(){
        System.out.println("C constructor called");
    }
}

// multi-level inheritance
// D inherits C
class D extends C{
    D(){
        System.out.println("D constructor called");
    }
}

// doesn't permit multiple inheritance like, extends A,B

public class Inheritance {
    static void main() {
        System.out.println("Creating obj A");
        var aobj = new A();
        System.out.println("Creating obj B");
        var bobj = new B();
        System.out.println("Creating obj C");
        var cobj = new C();
        System.out.println("Creating obj D");
        var dobj = new D();
    }
}
