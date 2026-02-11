package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwoParam {
    static void main() {
        Map<Integer, Integer> map = Map.of(1,2,3,4,5,6);
        System.out.println(map);
        map.forEach((key, val)-> System.out.println(key+"="+val));
    }
}
