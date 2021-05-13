package examples.ch14.set01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test03 {
    public static void main(String[] args) {
        //Example of Constructor Reference
        //Using Supplier interface
        //Using Lambda
        Supplier<List<String>> lambda = () -> new ArrayList<>();
        List<String> list = lambda.get();
        list.add("Shankar");
        list.add("Ghimire");
        list.forEach(System.out::println);
        System.out.println("---------------------------");
        //Using Met hod Reference
        Supplier<List<String>> methodRef = ArrayList::new;
        List<String> list2 = methodRef.get();
        list2.add("Shankar");
        list2.add("Ghimire");
        list2.forEach(System.out::println);

        /////////////////////////////////////
        System.out.println("--------------------");
        //Using Function interface
        Function<Integer, List<String>> lambda2 = (a)-> new ArrayList(a);
        List<String> list3 = lambda2.apply(5);
        list3.add("Shankar");
        list3.add("Ghimire");
        list3.forEach(System.out::println);



    }
}
