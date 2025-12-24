
// public class AddTwoNumbers
// {
// public static Node l1;
// public static Node l2;
    
// public static Node  solution(Node l1,Node l2){
//     Node dummy=new Node(0);
//     Node head=dummy;
//     Node tail=dummy;
//     int carry=0;
//     while(l1!=null || l2!=null || carry!=0){
//         int x=(l1!=null)? l1.data:0;
//         int y=(l2!=null)? l2.data:0;
//         int sum=x+y+carry;
//         carry=sum/10;
//         Node newnode=new Node(sum%10);
//         tail.next=newnode;
//         tail=newnode;
//         if(l1!=null) l1=l1.next;
//         if(l2!=null) l2=l2.next;

//     }
//     return head.next;
// }

// public static void printer(Node node){
//     while(node!=null){
//         System.out.print(node.data+ " -->");
//         node=node.next;
//     }
//     System.out.print("null");
// }
    
// public static void main(String args[])
// {

// l1 = new Node(1);
// l1.next = new Node(2);
// l1.next.next = new Node(3);
// l1.next.next.next = new Node(4);
// l1.next.next.next.next = new Node(5);
// l2=new Node(3);
// l2.next=new Node(1);
// l2.next.next=new Node(2);
// Node head=solution(l1,l2);
// printer(head);
// }
// }
