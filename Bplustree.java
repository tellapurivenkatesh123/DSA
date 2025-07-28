


// class Node{
//         int[] keys;          // Array of keys
//         int t;              // Minimum degree
//         Node child[];       // Array of child pointers
//         int n;              // Current number of keys
//         boolean leaf;       // Is true when node is leaf
//     Node(int t,boolean leaf){
//         this.t=t;
//         this.leaf=leaf;
//         this.keys=new int[(2*t)-1];
//         this.child=new Node[2*t];
//         this.n=0;
//     }
//     public  void splitChild(int i,Node y){
//         Node newnode=new Node(y.t,y.leaf);
//         newnode.n=t-1;
//         for(int j=0;j<t-1;j++){
//             newnode.keys[j]=newnode.keys[j+t];
//         }
//         if(!newnode.leaf){
//             for(int j=0;j<t;j++){
//                 newnode.child[j]=y.child[j+t];
//             }
//         }
//         y.n=t-1;
//         for(int j=n;j>=i+1;j--){
//             child[j+1]=child[j];
//         }
//         child[i+1]=newnode;
//         for(int j=n-1;j>=i;j--){
//             keys[j+1]=keys[j];
//         }
//         keys[i]=y.keys[t-1];
//         n++;
//     }
//     public  void insertNonFull(int k){

//     }
// }
// public class Bplustree {
// public static Node root;
// public static int t;


// public static void insert(int k){
//     if(root==null){
//         root =new Node(t,true);
//         root.keys[0]=k;
//         root.n=1;
//     }
//     else{
//         if(root.n==2*t-1){
//             Node newnode=new Node(t,false);
//             newnode.child[0]=root;
//             newnode.splitChild(0,root);
//             int i=0;
//             if(newnode.keys[0]<k){
//                 i++;
//             }
//             newnode.child[i].insertNonFull(k);

//             root=newnode;
//         }
//         else{
//             root.insertNonFull(k);
//         }
//     }

// }

// public static void main(String args[]){
// t=2;
// }
// }
