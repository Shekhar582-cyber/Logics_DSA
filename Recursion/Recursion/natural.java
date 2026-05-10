package Recursion;

public class natural {
    public static void prinT(int no){
        if(no<=10){
            System.out.println(no);
            prinT(no+1);
        }
    }
    public static void main(String[] args) {
        prinT(1);
    }
}
