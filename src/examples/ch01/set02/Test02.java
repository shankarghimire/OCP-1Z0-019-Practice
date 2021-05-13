package examples.ch01.set02;

public class Test02 {
    public static void main(String[] args) {
        String str = "liril";
        try{
            System.out.println(isPalindrome(str));
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }

    public static boolean isPalindrome(String input){
        if(input == null || input.length() == 0){
            throw new IllegalArgumentException("Input should not be null or empty!");
        }
        int i = 0;
        int j = input.length() - 1;
        for(i = 0; i <= j; i++, j--){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
