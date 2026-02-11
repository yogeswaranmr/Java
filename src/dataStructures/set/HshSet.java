package dataStructures.set;

import java.util.HashSet;

public class HshSet {
    static void main() {
        var hs = new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("a");
        hs.add("c");

        System.out.println("After adding:");
        for(String s:hs){
            System.out.println(s);
        }

        hs.remove("b");
        System.out.println("After remove:");
        for(String s:hs){
            System.out.println(s);
        }
    }
}
