package dataStructures.lst;

import java.util.ArrayList;

public class ArrLst {
    static void main() {
        var arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");

        System.out.println("After adding:");
        for(String a:arr){
            System.out.println(a);
        }

        arr.remove("b");

        System.out.println("After removing:");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}