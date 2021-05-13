package examples.ch01.set02;

public class Test03 {
    public static void main(String[] args) {

    }
    public void printAllPermutation(String text){
        char[] charArray = text.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            char c1 = charArray[i];
            for(int j = 0; j < charArray.length; j++){
                if(i != j){
                    System.out.println(c1 + "" +  charArray[j]);
                }
            }
        }
    }
}
