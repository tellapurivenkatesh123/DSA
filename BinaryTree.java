import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {
    public static Node root;
    public static void insert(int data, ArrayList<Node> arr){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
            arr.add(newnode);
            return;
        }
        for(Node current:arr){
            if(current.left==null){
                current.left=newnode;
                arr.add(newnode);
                return;
            }
            if(current.right==null){
                current.right=newnode;
                arr.add(newnode);
                return;
            }
        }
        
        
    }
    public static void main(String args[]){
        ArrayList<Node> arr=new ArrayList<>();
        insert(1,arr);
        insert(2,arr);
        insert(3,arr);
        insert(4,arr);
        insert(5,arr);
    }
}
