
import java.util.concurrent.TimeUnit;

class ManachersAlgorithm{

    // public static String longestPalindrome(String s) {
    //     if (s == null || s.length() == 0) return "";

    //     // Step 1: Transform
    //     StringBuilder t = new StringBuilder("^");
    //     for (char c : s.toCharArray()) {
    //         t.append("#").append(c);
    //     }
    //     t.append("#$");

    //     int n = t.length();
    //     int[] p = new int[n];

    //     int center = 0, right = 0;

    //     // Step 2: Main loop
    //     for (int i = 1; i < n - 1; i++) {
    //         int mirror = 2 * center - i;

    //         if (i < right)
    //             p[i] = Math.min(right - i, p[mirror]);

    //         // Step 3: Expand
    //         while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {
    //             p[i]++;
    //         }

    //         // Step 4: Update center and right
    //         if (i + p[i] > right) {
    //             center = i;
    //             right = i + p[i];
    //         }
    //     }

    //     // Step 5: Find max
    //     int maxLen = 0;
    //     int centerIndex = 0;
    //     for (int i = 1; i < n - 1; i++) {
    //         if (p[i] > maxLen) {
    //             maxLen = p[i];
    //             centerIndex = i;
    //         }
    //     }

    //     int start = (centerIndex - maxLen) / 2;
    //     return s.substring(start, start + maxLen);
    // }
    public static String longestPalindrome(String s){
    //check whether the string is empty;
    if(s==null || s.length()==0) return s;
    //transform the string into character array by separating with symbols;
    char[] t=new char[2*s.length()+3];
    t[0]='^';
    int index=1;
    for(int i=0;i<s.length();i++){
        t[index++]='#';
        t[index++]=s.charAt(i);
    }
    t[index++]='#';
    t[index++]='$';
// initialize new array to store the maximum length
int p[]=new int[t.length];
// initialize center and right
int center=0,right=0;
for(int i=1;i<t.length-1;i++){
    //initialize mirror;
    int mirror=2*center-i;
    if(i<right)
        p[i]=Math.min(right-i,p[mirror]);
    while (t[i+p[i]+1]==t[i-p[i]-1])
        p[i]++;
    if(i+p[i]>right){
        center=i;
        right=i+p[i];
    }
}
    int maxlen=0,cur_index=0;
    for(int i=1;i<p.length-1;i++){
        if(p[i]>maxlen){
            maxlen=p[i];
            cur_index=i;
        }
    }
    int start=(cur_index-maxlen)/2;
return s.substring(start,start+maxlen);
}


    public static void main(String args[]){
        String str1="v".repeat(10_000_000);
        Long start=System.nanoTime();
        String str=longestPalindrome(str1);
        Long end=System.nanoTime();
        //System.out.println(str);
        
        System.out.println("execution time:"+ TimeUnit.NANOSECONDS.toMillis(end-start));
    }
}