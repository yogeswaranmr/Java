package dataStructures.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQ {
    static void main() {
        // similar to minHeap in python
        System.out.println("Min-Heap");
        Queue<Integer> minpq = new PriorityQueue<>();
        minpq.offer(1); // add value
        minpq.offer(3);
        minpq.offer(2);

        System.out.println("peek value: "+minpq.peek()); // peek top value

        System.out.println("size of minpq: "+minpq.size()); // calculate size

        System.out.println("Values inside minpq:");
        while (!minpq.isEmpty()){
            System.out.println(minpq.poll()); // pop value
        }


        System.out.println("Max-heap");
        Queue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.offer(1); // add value
        maxpq.offer(3);
        maxpq.offer(2);

        System.out.println("peek value: "+maxpq.peek()); // peek top value

        System.out.println("size of maxpq: "+maxpq.size()); // calculate size

        System.out.println("Values inside maxpq:");
        while (!maxpq.isEmpty()){
            System.out.println(maxpq.poll()); // pop value
        }


        System.out.println("Min-Heap with More than one value");
        PriorityQueue<int[]> pq = new PriorityQueue<>(Arrays::compare);
        pq.offer(new int[] {2,3,1});
        pq.offer(new int[] {1,2,3});
        pq.offer(new int[] {1,2});

        while (!pq.isEmpty()){
            System.out.println(Arrays.toString(pq.poll()));
        }
    }
}
