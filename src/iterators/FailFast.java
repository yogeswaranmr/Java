package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    static void main() {
        List<String> items = new ArrayList<>(Arrays.asList("Apple","Burger","Carrot","Donut"));

        System.out.println("Before: "+items);

        Iterator<String> it = items.iterator(); // iterator takes snapshot of modCount, if it changes and any iterator method like .next()/.remove() is used, it throws error (.hasNex() doesn't check modCount)

        while(it.hasNext()){
            String food = it.next();
            if (food.contains("u")){
                // WRONG: items.remove(); instead use it.remove();
                // WRONG: items.add(); cannot be performed
                it.remove();
                System.out.println("Removed: "+food);
            }
        }

        System.out.println("After: "+items);
    }
}

//     [ A ]   [ B ]   [ C ]
//  ^
// Iterator is HERE
// (Before 'A')
// hasNext()? True (Because 'A' is ahead).
// next() value? Undefined (You haven't jumped over anything yet).


// Called next() ONCE The iterator "jumps over" 'A' and lands in the gap between A and B. It returns 'A' as it jumps.
//      [ A ]   [ B ]   [ C ]
//            ^
//      Iterator is HERE
//      (Between 'A' and 'B')
// Result: String val = it.next(); // val is "A"
// hasNext()? True (Because 'B' is ahead).