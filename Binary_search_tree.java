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
public class Binary_search_tree{
public static Node root;
public static void insert(int data){
    Node newnode=new Node(data);
    if(root==null){
        root=newnode;
        return;
    }
    Node node=root;
    while(true){
        if(data<node.data){
            if(node.left==null){
                node.left=newnode;
                return;
            }
            node=node.left;
        }
        else{
            if(node.right==null){
                node.right=newnode;
                return;
            }
            node=node.right;
        }
    }
}
public static void inorder(Node node){
    if(node==null)return;
    System.out.print(node.data+" ");
    inorder(node.left);
    inorder(node.right);
    
}

public static void main(String args[]){
    insert(20);
    insert(10);
    insert(50);
    insert(15);
    insert(5);
    inorder(root);
}

}