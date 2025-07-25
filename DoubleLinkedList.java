
class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DoubleLinkedList {

    public static Node head;
    public static Node tail;
    public static void insertAtStart(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=head;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
        
    }

    public static void print(){
        Node node=head;
        if(head==null)throw new IllegalArgumentException("list is empty");
        System.out.print("null <-- ");
        while(node!=null){
            System.out.print(node.data+" -->");
            node=node.next;
        }
        System.out.print("null");
    }
public static void insertAtEnd(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        tail=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
}
public static void insertAtMiddle(int data){
        Node newnode=new Node(data);

    if(head==null)throw new IllegalArgumentException("list is empty");
    if(head.next==null){
        head.next=newnode;
        newnode.prev=head;
        return;
    }
    Node fast=head.next;
    Node slow=head;
    while(fast.next!=null&&fast.next.next!=null  ){
        fast=fast.next.next;
        slow=slow.next;
    }
    newnode.next=slow.next;
    slow.next=newnode;
    newnode.prev=slow;
}

public static void insertAtPos(int i,int data){
    Node newnode=new Node(data);
    if(head==null)throw new IllegalArgumentException("list is empty");
    Node node=head;
    int pos=1;
    while(node.next!=null && pos<i-1){
        node=node.next;
        pos++;
    }
    if(pos<i-1)throw new IllegalArgumentException("list is less than position");
    newnode.next=node.next;
    newnode.prev=node;
    node.next=newnode;
    if(newnode.next==null)tail=newnode;
    
}
public static void removeFront(){
    if(head==null)throw new IllegalArgumentException("list is empty");
    if(head.next==null)head=null;
    head=head.next;
    head.prev=null;
}
public static void removeRare(){
    if(head==null)throw new IllegalArgumentException("list is empty");
    tail=tail.prev;
    tail.next=null;

}
public static void removePos(int i){
if(head==null)throw new IllegalArgumentException("iist is empty");
Node node=head;
int pos=1;
while(node.next!=null && pos<i-1){
node=node.next;
pos++;
}
if(pos<i-1)throw new IllegalArgumentException("list is lessthan position");
if(node.next.next==null){
    node.next.prev=null;
    node.next=null;
    tail=node;
    return;
}
node.next.next.prev=node;
node.next=node.next.next;


}
    public static void main(String args[]){
        insertAtStart(1);
        insertAtStart(2);
        insertAtStart(3);
        insertAtEnd(4);
        //insertAtMiddle(5);
        insertAtPos(5,0);
        // removeFront();
        // removeRare();
        removePos(4);
        print();
    }
}
