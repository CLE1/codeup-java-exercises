package Warmup7Jul;

public class WarmUp7Jul {
    public static void main(String[] args) {
        String string = "Hello My Name Is Chris.";
        for(int i = 0; i < string.length(); i++) {
            if(Character.isUpperCase(string.charAt(i))) {
                System.out.println(string.charAt(i));
            }
        }
    }
}
