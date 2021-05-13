package examples.ch01.set02;

public class Test01 {
    public static void main(String[] args) {
        String str = "123";
        try{
            int result = stringToNumber(str);
            System.out.println(result);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }


    }
    public static int stringToNumber(String input){
        if(input == null || input.equals("")){
            throw new IllegalArgumentException("Input must not be null or empty!");
        }
        //char charArr [] = input.toCharArray();
        int num = 0;
        for(int i = 0; i < input.length(); i++){
           if(!Character.isDigit(input.charAt(i))){
                throw new IllegalArgumentException("Argument should contain any letter or other symbols!");
            }
            //num = num * 10 + Integer.parseInt(String.valueOf(input.charAt(i)));
            //num = num * 10 + Integer.parseInt(Character.toString(input.charAt(i)));
            //num = num * 10 + Character.getNumericValue(input.charAt(i));
            num = num * 10 + (input.charAt(i) - '0');

        }
        return num;
    }
}
