import java.util.ArrayList;
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
public static void bfs(){
    if(root==null)return;
    ArrayList<Node> ary=new ArrayList<>();
    ary.add(root);
    while(!ary.isEmpty()){
        System.out.print(ary.get(0).data+"-->");
        if(ary.get(0).left!=null){
            ary.add(ary.get(0).left);
        }
        if(ary.get(0).right!=null){
            ary.add(ary.get(0).right);
        }
        ary.remove(0);
    }
    System.out.print("null");
}
    public static void main(String args[]){
        ArrayList<Node> arr=new ArrayList<>();
        insert(1,arr);
        insert(2,arr);
        insert(3,arr);
        insert(4,arr);
        insert(5,arr);
        bfs();
    }
}
