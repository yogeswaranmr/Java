package lambda;

import java.util.ArrayList;
import java.util.List;

public class MultipleStmts {
    static void main() {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
        arr.forEach(n->{
            System.out.println("Value received:");
            System.out.println(n);
        });
    }
}
