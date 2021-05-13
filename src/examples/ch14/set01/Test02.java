package examples.ch14.set01;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test02 {
    public static void main(String[] args) {
        //Example of Instance method reference
        var str = "Shankar";
//        boolean res = str.startsWith("S");
//        System.out.println(res);

        //Using Lambda
//        Predicate<String> lambda = s -> s.startsWith("S");
//        System.out.println(lambda.test(str));

        //Using Method Reference
        Predicate<String> methodRef = str::startsWith;
        System.out.println(methodRef.test("G"));
        System.out.println(methodRef.test("S"));

        ///////////////////////////
        var random = new Random();
        //Using Lambda
        Supplier<Integer> lambda2 = ()-> random.nextInt();
        System.out.println(lambda2.get());
        //Using MethodReference
        Supplier<Integer> methodRef2 = random::nextInt;
        System.out.println(methodRef2.get());
        ///////////////////
        BiPredicate<String, String> lambda3 = (a,b) -> a.startsWith(b);
        System.out.println(lambda3.test(str, "S"));
        System.out.println(lambda3.test(str, "G"));
        ///////////////
        BiPredicate<String, String> methodRef3 = String::startsWith;
        System.out.println(methodRef3.test(str, "S"));


    }
}
