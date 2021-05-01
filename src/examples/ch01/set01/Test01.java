package examples.ch01.set01;

public class Test01 {
    public static void main(String[] args) {
        //System.out.println(10/0); //ArithmeticException
        System.out.println(10.0/0);//Infinity
        System.out.println(-10.0/0);//-Infinity
        //System.out.println(0/0);//ArithmeticException
        System.out.println(0.0/0);//NaN
        System.out.println(-0/0.0);//Nan
    }
}
