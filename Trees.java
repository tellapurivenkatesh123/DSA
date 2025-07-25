import java.util.*;
class Node{
    int data;
    List<Node> children;
    Node(int data){
        this.data=data;
        this.children=new ArrayList<>();
    }
}

public class Trees {

public static void print(Node node,String indent){
    System.out.println(indent +node.data);
    for(Node child:node.children){
        print(child,indent+"  ");
    }
}
    public static void main(String args[]){
        Node root=new Node(0);
        Node child1=new Node(1);
        Node child2=new Node(2);
        Node child3=new Node(3);
        Node child4=new Node(4);
        Node child5=new Node(5);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        root.children.get(0).children.add(child4);
        root.children.get(0).children.get(0).children.add(child5);
        root.children.get(0).children.get(0).children.remove(0);
        print(root,"");
    }
}
