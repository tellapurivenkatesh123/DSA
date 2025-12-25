import java.util.HashMap;
public class TwoSum {
    public static int[] solution(int arr[],int target){
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
    
        for(int i= 0;i<arr.length;i++){
            int compliment=target-arr[i];
            if(map.containsKey(compliment) && map.get(compliment)!=i){
                return new int[]{i,map.get(compliment)};
            }
        }
        return new int[]{-1,-1};
    }

//  public int[] twoSum(int[] arr, int target) {
//     HashMap<Integer, Integer> map = new HashMap<>();

//     for (int i = 0; i < arr.length; i++) {
//         int complement = target - arr[i];
//         if (map.containsKey(complement)) {
//             return new int[]{map.get(complement), i};
//         }
//         map.put(arr[i], i);
//     }
//     return new int[]{-1, -1};
// }
    public static void main (String args[]){
        int[] arr={1,-1,2,3,5};
        int[] res= solution(arr,5);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
