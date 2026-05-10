

class Node{
    int data;
    Node next;
}
class SLL{
    Node head,tail;
    public  void creation(int value){
        Node node = new Node();
        node.data = value;
        node.next=null;
        head=tail=node;
    }
    public void inseration(int location,int value){

        Node node = new Node();
        node.data= value;
        if (location==0){
            node.next =head;
            head=node;
        }
        else {
            node.next=null;
            tail=tail.next=node;
        }
    }
    public  void traverse(){
        Node temp =head;
        while (temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    public void search(int value){
        Node temp = head;
        while (temp!=null){
            if (temp.data==value){
                System.out.println("the value is present");
                return;
            }
            temp=temp.next;
        }
        System.out.println("the value is not present");
    }

    public void delete(){
        head=tail=null;
        System.out.println("the ll get distroyed");
    }
}
public class DSAMainClass {
    public static void main(String[] args) {
        SLL s = new SLL();
        s.creation(4);
        s.inseration(1,2);
       s.inseration(2,4);
       s.traverse();
       s.search(2);
       s.delete();
    }
}
