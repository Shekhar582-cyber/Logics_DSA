import java.util.Scanner;

public class Stack_otp {
    int[] stack;
    int top=-1;
    Stack_otp(int size){
        stack = new int[size];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top== stack.length-1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is already full");
        }
        else {
            stack[++top]=value;
            System.out.println("the value is inserted");
        }
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("the stack is Empty");
        }
        else {
            int v = stack[top];
            top--;
            System.out.println("The value "+v+"get added");
        }
    }
    public void peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
        }
        else {
            System.out.println("The value is"+stack[top]);
        }
    }

    public void delete(){
        stack=null;
        System.out.println("the stack is deleted");
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack_otp s1 = new Stack_otp(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Delete Stack");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s1.push(val);
                    break;

                case 2:
                    s1.pop();
                    break;

                case 3:
                    s1.peek();
                    break;

                case 4:
                    System.out.println("Is Empty: " + s1.isEmpty());
                    break;

                case 5:
                    System.out.println("Is Full: " + s1.isFull());
                    break;

                case 6:
                    s1.delete();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

        }

