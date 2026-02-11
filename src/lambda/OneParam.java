package lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class OneParam {
    static void main() {
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);
    }
}
