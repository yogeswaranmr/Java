package SOLID.LSP;

// "Subtypes must be substitutable for their base types."
// "The 'Square is a Rectangle' fallacy."

import java.util.ArrayList;

// The base class makes no promises about flying.
class BirdGLSP{
    public void eat(){
        System.out.println("Eats...");
    }
}

interface Flyable{
    void fly();
}

// Eagle promises to fly
class Sparrow extends BirdGLSP implements Flyable{
    @Override
    public void eat(){
        System.out.println("Sparrow Eats...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow Flies...");
    }
}

// Penguin doesn't make promises it can't keep
class Penguin extends BirdGLSP{
    @Override
    public void eat() {
        System.out.println("Penguin Eats...");
    }
    // No fly() method to break!
}

public class GoodLSP {
    static void main() {
        var birdList = new ArrayList<BirdGLSP>();
        birdList.add(new Sparrow());
        birdList.add(new Penguin());

        for ( BirdGLSP bird : birdList){
            bird.eat();
        }
    }
}