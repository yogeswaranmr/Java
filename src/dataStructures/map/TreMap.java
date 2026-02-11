package dataStructures.map;

import java.util.TreeMap;

public class TreMap {
    static void main() {
        var tm = new TreeMap<String, Integer>();
        tm.put("a",1);
        tm.put("b",2);
        tm.put("c",3);

        System.out.println("After adding:");
        for(String k:tm.keySet()){
            System.out.println(k+":"+tm.get(k));
        }

        tm.remove("b");

        System.out.println("After remove");
        for(String k:tm.keySet()){
            System.out.println(k+":"+tm.get(k));
        }
    }
}
