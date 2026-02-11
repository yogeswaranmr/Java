package oop;

class Animal{
    public void sound(){
        System.out.println("This animal makes sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Wawfff");
    }
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
    }
}
