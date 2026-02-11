package oop;

public class Constructors {
    Constructors(){
        System.out.println("No param Constructor executed.");
    }
    Constructors(String data){
        System.out.println("Param Constructor executed with data: "+data);
    }
}

class ExecuteConstructors{
    static void main() {
        Constructors obj = new Constructors();
        Constructors obj2 = new Constructors("Obj2");
    }
}