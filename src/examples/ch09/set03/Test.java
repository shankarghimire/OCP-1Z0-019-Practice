package examples.ch09.set03;

public class Test {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER.getHours());
        System.out.println(Season.WINTER.getHours());
        for(Season season: Season.values()){
            System.out.println(season.ordinal() + " " + season.name() + ":" + season.getHours());
        }
    }
}
