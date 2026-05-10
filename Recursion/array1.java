public class array1 {

        int[] arr;

        public array1(int size) {
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

        public void search(int value) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.println("Found at index " + i);
                    return;
                }
            }
            System.out.println("Not found");
        }

        public void delete(int index) {
            if (index < 0 || index >= arr.length) {
                System.out.println("Invalid index");
                return;
            }
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Deleted");
        }



    public static void main(String[] args) {
            array1 a = new array1(2);
            a.insert(0,4);
            a.insert(1,5);
            a.traverse();

            a.search(4);
            a.delete(1);

            a.traverse();


    }

    }



