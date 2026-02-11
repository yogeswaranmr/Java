package basics;

public class Enum {
    static void main() {
        // enum is a  special class that has group of constants
        enum Level{
            LOW ("low level"),
            MEDIUM ("medium level"),
            HIGH ("high level");

            Level(String desc){
                System.out.println("Constructor executed: " + desc);
            }
        }
        var levelLOW = Level.LOW;
        System.out.println(levelLOW);

        for (Level l : Level.values()) {
            System.out.println(l);
        }
    }
}
