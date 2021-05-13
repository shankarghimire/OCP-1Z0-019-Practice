package examples.ch14.set05;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(5);
        System.out.println(treeSet);

        //System.out.println(treeSet);

    }
}
