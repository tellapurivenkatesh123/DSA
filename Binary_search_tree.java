
import java.util.Stack;
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
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
    
}

public static boolean search_iterative(int key){
    if(root==null) throw new IllegalArgumentException("tree is empty");
    if(root.data==key)return true;
    Node node=root;
    while (node != null) {
        if (key == node.data) return true;
        else if (key < node.data) node = node.left;
        else node = node.right;
    }
    return false;
}
public static boolean search(Node node,int key){
    if(node==null)return false;
    if(node.data==key)return true;
    return (key<node.data)?search(node.left,key):search(node.right,key);

}

public static void inorder_stack(){
    Stack <Node> s=new Stack<>();
    if(root==null)throw new IllegalArgumentException("tree is empty");
    Node node=root;
    while(node!=null ||  !s.isEmpty()){
        while(node!=null){
            s.push(node);
            node=node.left;
        }
        node=s.pop();
        System.out.print(node.data+" ");
        node=node.right;
    }
}
public static void preorder_stack(){
    Stack <Node> s=new Stack<>();
    if(root==null)throw new IllegalArgumentException("tree is empty");
    Node node=root;
    s.push(node);
    while(!s.isEmpty()){
        Node cur=s.pop();
        System.out.print(cur.data+" ");

        if(cur.right!=null)
            s.push(cur.right);
        
        if(cur.left!=null)
        s.push(cur.left);
    }
}
public static void preorder(Node node){
    if(node==null)return;
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
}
// public static void postorder_stack(){
//     if(root==null)throw new IllegalArgumentException("tree is empty");
//     Node node=root;
//     Stack<Node> s=new Stack<>();
//     while(node!=null || !s.isEmpty()){
//         while(node!=null){
//             s.push(node);
//             if(node.right!=null)
//                     s.push(node.right);
//             if(node.left!=null)
//                     node=node.left;
//         }
//         Node cur=s.pop();
//         System.out.print(cur.data+" ");
//         node=cur;
//     }
// }

public static void postorder(Node node){
    if(node==null)return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data+" ");
}
public static void main(String args[]){
    insert(10);
    insert(9);
    insert(8);
    insert(15);
    insert(13);
    //inorder(root);
    //inorder_stack();
    //System.out.println(search(root,3));
//preorder(root);
//preorder_stack();
// postorder(root);
//postorder_stack();
}
}