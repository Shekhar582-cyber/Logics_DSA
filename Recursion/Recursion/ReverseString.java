package Recursion;

public class ReverseString {
    public static String reVerse(String str){
        if(str.isEmpty()){
            return  "";
        }
        else {
            return reVerse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        System.out.println( reVerse("Hello"));

    }
}
