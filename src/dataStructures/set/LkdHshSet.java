package dataStructures.set;

import java.util.LinkedHashSet;

public class LkdHshSet {
    static void main() {
        var ls = new LinkedHashSet<String>();

        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("a");

        System.out.println("After adding:");
        for(String s:ls){
            System.out.println(s);
        }

        System.out.println("After remove:");
        for(String s:ls){
            System.out.println(s);
        }
    }
}
