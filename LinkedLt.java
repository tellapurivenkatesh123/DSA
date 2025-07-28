

// // class Node{
// //     int data;
// //     Node next;
// //     Node(int data){
// //         this.data=data;
// //         this.next=null;
// //     }
// }
// public class LinkedLt{
// public static Node head;
// public static Node tail;

// public static void addRare(int data){
//     Node newnode=new Node(data);
//     if (head==null)
//     {
//         head=newnode;
//         tail=head;
//         return;
//     }
//     tail.next=newnode;
//     tail=newnode;


// }
// public static void addFront(int data){
//     Node newnode= new Node(data);
//     newnode.next=head;
//     head=newnode;
// }
// public static void insert(int i,int data){
// Node newnode=new Node(data);
// if(i==0){
//     newnode.next=head;
//     head=newnode;
//     System.out.println("inserted at position "+i);
//     return;
// }
// Node node=head;
// int pos=1;
// while(node!=null && pos<i ){
//     node=node.next;
//     pos++;
// }
// if(node==null)throw new IllegalArgumentException("index out of bounds");
// newnode.next=node.next;
// node.next=newnode;
// System.out.println("inserted at position "+ i);

// }
// public static void delRare(){
//     Node node=head;
//     if(head!=null){
//         while(node.next.next!=null){
//             node=node.next;
//         }
//         node.next=null;
//         return;
//     }
//     head=null;
// }
// public static void delFront(){
//     if(head!=null){
//         head=head.next;
//     }
// }
// public static void del(int i){
//     if(head!=null){
//         Node node=head;
//         int len=1;
//         while(head!=null && len <i){
//             node=node.next;
//             len++;
//         }
//         if(node==null || len==i){
//             return;
//         }
//         node.next=node.next.next;
//     System.out.println("deleted at position "+len);

//     }
    
// }
// public static void print(){
//     if(head==null)throw new IllegalArgumentException("list is empty");
// Node node=head;
// while(node!=null){
// System.out.print(node.data+" --> ");
// node=node.next; 
// }
// System.out.println("null");
// }
// public static void insertMiddle(int data){
//     if(head==null)return;
//     Node newnode=new Node(data);
// Node fast=head.next;
// Node slow=head;

// while(fast.next.next!=null && fast.next!=null){
//     fast=fast.next.next;
//     slow=slow.next;
// }
// newnode.next=slow.next.next;
// slow.next=newnode;
// }
// public static void main(String args[]){
// // head = new Node(1);
// // head.next = new Node(2);
// // head.next.next = new Node(3);
// // head.next.next.next = new Node(4);
// // head.next.next.next.next = new Node(5);
// // tail=head.next.next.next.next;
// // // addRare(6);
// // // addRare(7);
// // // addRare(8);
// // // // addFront(0);
// // // print();
// // // // insert(8,7);
// // // print();
// // // delRare();
// // // delFront();
// // // // del(7);
// // insertMiddle(0);
// //print();

// }
// }