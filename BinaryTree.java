// import java.util.ArrayList;
// import java.util.Stack;
// public class BinaryTree {
//     public static Node root;
//     public static void insert(int data, ArrayList<Node> arr){
//         Node newnode=new Node(data);
//         if(root==null){
//             root=newnode;
//             arr.add(newnode);
//             return;
//         }
//         for(Node current:arr){
//             if(current.left==null){
//                 current.left=newnode;
//                 arr.add(newnode);
//                 return;
//             }
//             if(current.right==null){
//                 current.right=newnode;
//                 arr.add(newnode);
//                 return;
//             }
//         }
        
        
//     }
// public static void  bfs(){
//     if(root==null)return;
//     ArrayList<Node> ary=new ArrayList<>();
//     ary.add(root);
//     while(!ary.isEmpty()){
//         System.out.print(ary.get(0).data+"-->");
//         if(ary.get(0).left!=null){
//             ary.add(ary.get(0).left);
//         }
//         if(ary.get(0).right!=null){
//             ary.add(ary.get(0).right);
//         }
//         ary.remove(0);
//     }
//     System.out.print("null");
// }
// public static void dfs(){
//     if(root==null)return;
//     Stack<Node> stc=new Stack<>();
//     stc.push(root);
//     while(!stc.isEmpty()){
//         Node node=stc.peek();
//         System.out.print(stc.pop().data+"-->");
//         if(node.right!=null)stc.push(node.right);
//         if(node.left!=null)stc.push(node.left);
//     }
//     System.out.println("null");
// }

// public static void preorder_traversal(Node  node){
//     if(node==null)return;
//     System.out.print(node.data+"  ");
//     preorder_traversal(node.left);
//     preorder_traversal(node.right);
// }
// public static void inorder_traversal(Node node){
//     if(node==null)return;
//     inorder_traversal(node.left);
//     System.out.print(node.data+"  ");
//     inorder_traversal(node.right);
// }
// public static void postorder_traversal(Node node){
//     if(node==null)return;
//     postorder_traversal(node.left);
//     postorder_traversal(node.right);
//     System.out.print(node.data+"  ");
// }
//     public static void main(String args[]){
//         ArrayList<Node> arr=new ArrayList<>();
//         insert(1,arr);
//         insert(2,arr);
//         insert(3,arr);
//         insert(4,arr);
//         insert(5,arr);
//         // preorder_traversal(root);
//         // System.out.println();
//         // bfs();
//         // dfs();
//         // inorder_traversal(root);
//         // System.out.println();
//         // postorder_traversal(root);

//     }
// }


