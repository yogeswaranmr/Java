package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProducerExtends {
    // ? will be a child of Number (here) or Number itself
    // safe to read
    public static double sumList(List<? extends Number> list){
        double sum = 0.0;
        for(Number num:list){
            sum+=num.doubleValue();
        }
        return sum;
    }
}

class ConsumerSuper{
    // ? will be parent of Integer(here) or Integer itself
    // safe to write
    public static void addNumbers(List<? super Integer> list){
        for(int i=0;i<=10;i++){
            list.add(i);
        }
    }
}

public class PECS {
    static void main() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        double ans = ProducerExtends.sumList(list1);
        System.out.println(ans);

        List<Integer> list2 = new ArrayList<>();
        ConsumerSuper.addNumbers(list2);
        System.out.println(list2);
    }
}
