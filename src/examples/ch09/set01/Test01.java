package examples.ch09.set01;

public class Test01 {
    public static void main(String[] args) {
        examples.ch09.set02.Season s = examples.ch09.set02.Season.WINTER;
        System.out.println(s);
        System.out.println(examples.ch09.set02.Season.WINTER);
        System.out.println(s == examples.ch09.set02.Season.WINTER);
        System.out.println();
        for(examples.ch09.set02.Season season: examples.ch09.set02.Season.values()){
            System.out.println(season.ordinal() + " " + season.name());
        }
        System.out.println("-------------------");
        examples.ch09.set02.Season s1 = examples.ch09.set02.Season.valueOf("SUMMER");
        System.out.println(s1);
        System.out.println("--------------------");
        //Enum in Switch
        switch (s){
            case WINTER:
                System.out.println("It's Winter");
                break;
            case SUMMER:
                System.out.println("It's summer");
            case SPRING:
                System.out.println("It's Spring");
                break;
            case FALL:
                System.out.println("It's Fall");
                break;
            default:
                System.out.println("It's invalid value");
        }
    }
}
