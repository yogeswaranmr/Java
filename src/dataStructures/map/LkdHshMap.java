package dataStructures.map;

import com.sun.management.HotSpotDiagnosticMXBean;

import java.util.LinkedHashMap;

public class LkdHshMap {
    static void main() {
        var lm = new LinkedHashMap<Integer, Integer>();
        lm.put(1,1);
        lm.put(2,2);
        lm.put(3,3);

        System.out.println("After adding:");
        for(int k:lm.keySet()){
            System.out.println(k+":"+lm.get(k));
        }

        lm.remove(1);

        System.out.println("After removing:");
        for(Integer k:lm.keySet()){
            System.out.println(k+":"+lm.get(k));
        }
    }
}
