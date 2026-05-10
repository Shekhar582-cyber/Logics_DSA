package Recursion;

public class Reversenatural {
    public static void prinT(int no){
        if (no>=1){
            System.out.println(no);
            prinT(no-1);
        }
    }
    public static void main(String[] args) {
        prinT(10);
    }
}
