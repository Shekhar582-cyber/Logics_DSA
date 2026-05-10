public class linearSearch {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50};
        int search = 40;

        for (int i = 0;i<a.length;i++){
            if (a[i]==search){
                System.out.println("the elment is present at the index:"+i);
                return;
            }
            System.out.println("The element is not present the Array");

        }

    }
}
