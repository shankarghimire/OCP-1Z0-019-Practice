package examples.ch14.set05;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1 - o2; // Adcending order
        //return -(o1-o2); //for descending order
//        if(o1 < o2){
//            return 1;
//        }
//        else if(o1 > o2){
//            return -1;
//        }
//        else{
//            return 0;
//        }

        return - (o1.compareTo(o2));
    }
}
