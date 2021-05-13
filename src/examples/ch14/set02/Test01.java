package examples.ch14.set02;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(5));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);

    }
}
