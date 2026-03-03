package oop;

class Animal{
    public void sound(){
        System.out.println("This animal makes sound");
    }
    public void info(){
        System.out.println("This is an Animal");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Wawfff");
    }
    @Override
    public void info(){
        System.out.println("This is a Dog");
    }
    // Cannot override with Narrow Visibility
    // eg, by liskov rule, if a child class replace parent class nothing should break
    // so eg, This CAN'T be done: public overridden by protected, default, private
    // but can override with Wide visibility
}

class Cat extends Animal{
    public void sound() {
        System.out.println("Meowww");
    }
}

public class Polymorphism {
    static void main() {
        var dobj = new Dog();
        var cobj = new Cat();

        dobj.sound();
        cobj.sound();

        dobj.info();
        cobj.info();
    }
}
