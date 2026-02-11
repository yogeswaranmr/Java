package oop;

class Vehicle{
    Vehicle(){
        System.out.println("This is a vehicle");
    }
    public void about(){
        System.out.println("About Vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is a car");
    }
    public void about(){
        super.about();
        System.out.println("About Car");
    }
}

public class Super {
    static void main() {
        var obj = new Car();
        obj.about();
    }
}
