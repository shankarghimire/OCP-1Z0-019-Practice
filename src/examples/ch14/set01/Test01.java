package examples.ch14.set01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(10);
        listNumbers.add(15);
        listNumbers.add(5);
        listNumbers.add(25);
        listNumbers.add(20);
        System.out.println(listNumbers);
        //Example of Static method reference
        //Consumer<List<Integer>> lambda = n -> Collections.sort(n); //Using Lambda
        //lambda.accept(listNumbers);
        Consumer<List<Integer>> methodRef = Collections::sort;
        methodRef.accept(listNumbers);
        //listNumbers.forEach(n-> System.out.println(n)); //Using Lambda
        listNumbers.forEach(System.out::println); //Using Method Reference

    }
}
