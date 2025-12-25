import java.util.HashMap;
// import java.util.Hashset;
public class LongestSubStringWithoutRepeatingCharacter {
    // public static int solution(String s){
    //     HashSet<Character> set=new HashSet<>();
    //     int left=0;
    //     int maxlen=0;
    //     for(int right=0;right<s.length();right++){
    //         while(set.contains(s.charAt(right))){
    //             set.remove(s.charAt(left));
    //             left++;
    //         }
    //         set.add(s.charAt(right));
    //         maxlen=Math.max(maxlen,right-left+1);
    //     }
    //     return maxlen;
    // }
    public static int solution(String s){
        int maxlen=0;
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String args[]){
        System.out.println(solution("vv "));
    }
}
