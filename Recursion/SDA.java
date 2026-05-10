class SDA {
    String[] arr;

    // Constructor
    public SDA(int size) {
        arr = new String[size];
    }

    // Insert
    public void insert(int index, String value) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        if (arr[index] == null) {
            arr[index] = value;
            System.out.println("Inserted successfully");
        } else {
            System.out.println("Index already occupied");
        }
    }

    // Traverse
    public void traverse() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    // Search
    public void search(String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(value)) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }
        System.out.println("Value not found");
    }

    // Delete
    public void delete(int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        if (arr[index] != null) {
            arr[index] = null;
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Already empty");
        }
    }

            public static void main(String[] args) {
                SDA s = new SDA(5);

                s.insert(0, "Java");
                s.insert(1, "SQL");
                s.insert(2, "JS");

                s.traverse();

                s.search("SQL");

                s.delete(1);

                s.traverse();
            }
        }

