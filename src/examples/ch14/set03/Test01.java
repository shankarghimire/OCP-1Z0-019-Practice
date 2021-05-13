package examples.ch14.set03;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(Integer.reverseBytes(15));
        System.out.println(Integer.numberOfLeadingZeros(00004));
        int result = Integer.compare(3,3);
        System.out.println(result);
        Integer n = 12;
        
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.reverse(12));
        Long l = 10L;
        long l2 = 10;
        System.out.println(Long.BYTES);
    }
}
