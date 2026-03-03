package interfaces;

interface Animal{
    // implicitly all variable inside interface are public static final
    String parentInterface = "Animal";
    void makeSound(); // this'll force classes implementing this to override with a body
    // interface cannot implement another interface
    static void canInterfaceMethodsHaveBody(){
        System.out.println("Yes... but only with default or static or private keyword! Only with One!");
        // default can be overridden in implementing class
        // static belongs to interface so no override
        // private is not visible to outside, mostly used to store dupliCate code that'll be used by other interface methods
    }
}

interface Flyable{
    String parentInterface = "Flyable";
    void fly();
}

class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow...");
    }
}

class Duck implements Animal, Flyable{
    // class can implement more than 1 interface
    @Override
    public void makeSound() {
        System.out.println("Quack...");
    }

    @Override
    public void fly() {
        System.out.println("Flies...");
    }
}

public class InterfaceMain {
    static void main() {
        System.out.println("Cat class with Animal, Flyable interface");
        Cat catObj = new Cat();
        catObj.makeSound();
        System.out.println("Cat Parent Interface: "+catObj.parentInterface);
        System.out.println();

        System.out.println("Duck class with Animal interface");
        Duck duckObj = new Duck();
        duckObj.makeSound();
        // duckObj.parentInterface -> ERROR! Diamond Problem!
        System.out.println("Duck 1 Parent Interface: "+Animal.parentInterface);
        System.out.println("Duck 2 Parent Interface: "+Flyable.parentInterface);
        System.out.println();

        Animal.canInterfaceMethodsHaveBody();
    }
}