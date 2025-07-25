
public class Arrays {
    public static void insert(int data,int pos,int[] num,int size){
        if(pos>=size){throw new IllegalArgumentException("index out of bound");

    }
        num[pos]=data;
    }
    public static void print(int[] num){
        for(int i=0;i<num.length;i++)System.out.print(num[i]);
    }

public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int[] num=new int[i];
insert(-1,0,num,i);
insert(1,1,num,i);
insert(2,2,num,i);
insert(3,3,num,i);
insert(4,4,num,i);
// insert(1,5,num,i);
print(num);
    }
}
