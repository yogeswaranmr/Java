package oop;

// importing package
import basics.*;
import basics.Loops;

class Demo {
    private int attr; // attribute
    public void set(int attr){ // setter method
        this.attr = attr; // using this keyword
        System.out.println("attr value changed!");
    }
    public int get() { // getter method
        return attr;
    }
}

public class Basic{
    static void main() {
       Demo obj = new Demo(); // object creation
       obj.set(10); // accessing object method setter
       int a = obj.get(); // using getter
       System.out.println(a);
    }
}
