package lambda;

import java.util.ArrayList;
import java.util.List;

public class ZeroParam {
    static void main() {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
        arr.forEach(_ -> System.out.println("Value passed!"));
    }
}
