package examples.ch05.set01;

public class Test01 {
    public static void main(String[] args) {
        Object o = new Object();
        Thread t  = new Thread();
        String s = new String("hello");
        StringBuffer sb = null;

        System.out.println(o == null);
        System.out.println(t == null);
        System.out.println(s == null);
        System.out.println(sb == null);
        System.out.println(null == null);

    }
}
