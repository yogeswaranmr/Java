package dataStructures.set;

import java.util.TreeSet;

public class TreSet {
    static void main() {
        var ts = new TreeSet<String>();
        ts.add("c");
        ts.add("b");
        ts.add("c");
        ts.add("a");

        System.out.println("After adding:");
        for (String s : ts){
            System.out.println(s);
        }

        ts.remove("b");
        System.out.println("After remove:");
        for(String s:ts){
            System.out.println(s);
        }
    }
}
