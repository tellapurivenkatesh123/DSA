
public class stacks {
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static Node top;
    public static void insert(int data){
        Node newnode=new Node(data);
        if(top==null){
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;
    }
    public static void print(){
        Node node=top;
        if(node==null)throw new IllegalArgumentException("stack is empty/underflow");
        while(node!=null){
            System.out.print(node.data+" -->");
            node=node.next;
        }
        System.out.println("null");
    }
public static void remove(){
    if(top==null)throw new IllegalArgumentException("stsck is empty/underflow");
    top=top.next;
}
public static void length(){
    if(top==null)throw new IllegalArgumentException("stack is empty");
    Node node=top;
    int i=1;
    while(node.next!=null){
        i++;
        node=node.next;
    }
    System.out.println("length->>"+i);
}
public static void main(String args[]){
// top=new Node(1);
// top.next= new Node(2);
// top.next.next=new Node(3);
insert(1);
insert(2);
insert(3);
length();
remove();
length();
print();
}
}
