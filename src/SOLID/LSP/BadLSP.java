package SOLID.LSP;

// "Subtypes must be substitutable for their base types."
// "The 'Square is a Rectangle' fallacy."

import java.util.ArrayList;

class BirdBLSP{
    public void fly(){
        System.out.println("Flies...");
    }
}

class Eagle extends BirdBLSP{
    @Override
    public void fly(){
        System.out.println("Eagle Flies...");
    }
}

class Ostrich extends BirdBLSP{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich Cannot Fly!");
    }
}

public class BadLSP {
    static void main() {
        var birdList = new ArrayList<BirdBLSP>();
        birdList.add(new Eagle());
        birdList.add(new Ostrich());

        for (BirdBLSP bird : birdList){
            bird.fly(); // Ostrich fly throws error! This cannot replace parent
        }
    }
}
