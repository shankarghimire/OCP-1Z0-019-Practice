package examples.ch09.set02;

public class Test02 {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        //System.out.println(s);
        s.printExpectedVisitors();
         Season.SUMMER.printExpectedVisitors();

        for(Season season: Season.values()){
            System.out.println( season.ordinal() + " " + season.name());
        }
    }
}
