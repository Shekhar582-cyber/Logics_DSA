public class array2 {

        int[] arr;

        public array2(int size) {
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        public void insert(int index, int value) {
            if (index < 0 || index >= arr.length) {
                System.out.println("Invalid index");
                return;
            }

            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("Inserted successfully");
            } else {
                System.out.println("Index already occupied");
            }
        }

        public void traverse() {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public void search_Index(int index) {
            try{
                if (arr[index]!=Integer.MIN_VALUE){
                    System.out.println(arr[index]);
                    return;
                }
                else {
                    System.out.println("the cell is empty");
                }

            }
            catch (Exception e ){
                System.out.println("Invalid index");
            }

        }



        public void delete_by_value(int value) {

            for (int i= 0;i<arr.length;i++){
                if (arr[i]==value){
                    arr[i]=Integer.MIN_VALUE;
                    return;
                }
            }
            System.out.println("Value is not present");
        }



        public static void main(String[] args) {
            array2 a = new array2(2);
            a.insert(0,4);
            a.insert(1,5);
            a.traverse();

            a.search_Index(4);
            a.delete_by_value(1);

            a.traverse();


        }

    }





