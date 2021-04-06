package examples.ch05;

public class Test01 {
    public static void main(String[] args) {
        Number n1 = Integer.valueOf(101);
        System.out.println(n1);
        if(n1 instanceof Byte){
            System.out.println("true");
        }
        else if(n1 instanceof Short){
            System.out.println("false");
        }
        else if(n1 instanceof Long){
            System.out.println("false");
        }
        else if(n1 instanceof Integer){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
