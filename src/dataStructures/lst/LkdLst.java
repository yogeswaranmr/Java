package dataStructures.lst;

import java.util.LinkedList;

public class LkdLst {
    static void main() {
        var lst = new LinkedList<String>();
        lst.add("a");
        lst.add("b");
        lst.add("c");

        System.out.println("After adding:");
        for(String l:lst){
            System.out.println(l);
        }

        lst.remove("b");

        System.out.println("After removing:");
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }
    }
}
