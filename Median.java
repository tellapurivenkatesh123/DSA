import java.util.Arrays;
public class Median {
    public static int solution(int[] arr1,int[] arr2){
        int n=arr1.length+arr2.length;
        int res[]=new int[n];
        int k=0;
        for(int i:arr1)res[k++]=i;
        for(int i:arr2)res[k++]=i;
        Arrays.sort(res);
        if(n%2==0){
            return (res[n/2-1]+res[n/2])/2;
        }
        return res[n/2];
    }
    public static void main(String args[]){
        int[] arr1=new int[]{1,-1,3,2};
        int[] arr2=new int[]{-2,4,2,5};
        int result=solution(arr1,arr2);
        System.out.println(result);
    }
}
