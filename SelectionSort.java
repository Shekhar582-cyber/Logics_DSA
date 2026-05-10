import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a ={7,2,4,5,1};
        for (int i = 0; i < a.length; i++) {
            int cmin=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[cmin]){
                    cmin=j;

                }
            }
            int temp = a[i];
            a[i] = a[cmin];
            a[cmin]=temp;


        }
        System.out.println(Arrays.toString(a));
    }
}
