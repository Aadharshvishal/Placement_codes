class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class linked{
    Node head,tail;
    public void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Linkedlist{
    public static void main(String[] args) {
        linked l1=new linked();
        l1.insert(17);
        l1.insert(10);
        l1.insert(50);
        l1.display();
    }
}
