package dataStructures.map;

import java.util.HashMap;

public class HshMap {
    static void main() {
        var hm = new HashMap<String, Integer>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);

        System.out.println("After adding:");
        for(String k:hm.keySet()){
            System.out.println(k+":"+hm.get(k));
        }

        hm.remove("b");

        System.out.println("After removing:");
        for(String k:hm.keySet()){
            System.out.println(k+":"+hm.get(k));
        }
    }
}
