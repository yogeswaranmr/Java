package iterators;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    static void main() {
        // Uses a Snapshot mechanism
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String s = it.next();
            // SAFE: This creates a NEW array copy internally.
            // The iterator keeps reading the OLD array ("A", "B").
            list.add("C");
        }
        // Loop finishes safely. list now contains "A", "B", "C".

        System.out.println(list);
    }
}

// Scenario A: Modification (Put/Remove)
//If Thread A is iterating through a linked list in Bucket 5, and Thread B adds a new node to the end of that same list, the iterator might see it or might not, depending on whether it has already passed that point.
//Because the next pointers are volatile, the iterator immediately sees the updated link. It doesn't crash; it just follows the new path.
//Removal: If a node is removed, the map unlinks it. If the iterator was on that node, it can still move to the next node because the removed node's next pointer is still valid (it just isn't reachable from the head anymore).

// Resizing (The "Forwarding Node")
//The biggest threat to an iterator is Resizing. What if the map doubles in size and moves all the data to a new array while you are iterating over the old array?
//ConcurrentHashMap solves this with a special marker called a ForwardingNode.
//The Move: When the map resizes, it moves data bucket-by-bucket.
//The Marker: Once a bucket (say, Bucket 10) is moved to the new array, the map replaces the data in Bucket 10 with a ForwardingNode.
//The Iterator's Encounter:
//The iterator arrives at Bucket 10.
//It sees the ForwardingNode instead of a standard list.
//The Reaction: The ForwardingNode acts like a signpost saying "Data Moved to New Table".
//The iterator reads this sign, jumps to the New Table, finds where Bucket 10's data went, and continues iterating there.
// The Scan (Reading New Data): It finds the specific buckets in the New Table where Old Bucket 10's data went. (Note: Since the size doubled, the data from Old Bucket 10 is usually split between New Bucket 10 and New Bucket 26). It iterates through those specific new buckets to give you the data.
//The Return (Back to Logic): Once it finishes reading that specific moved data, it jumps back to its previous context in the Old Table.
//The Continuation (Bucket 11): It steps to Old Table Index 11.
//Case A: If Bucket 11 is still there (not moved yet), it reads it normally.
//Case B: If Bucket 11 is also a ForwardingNode (already moved), it performs the jump-and-return dance again.