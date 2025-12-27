public class Strings {
    // public static String rightrotate(String str,int n){
    //     n=n%str.length();
    //     return str.substring(str.length()-n)+str.substring(0,str.length()-n);
    // }
    public static String rr(String str){

        return str.substring(str.length()-1)+str.substring(0,str.length()-1);
    }
    // public static boolean isvowel(char c){
    //     return c == 'a' || c=='e' || c=='i' || c=='o' || c=='u';
    // }
    public static boolean isvowel(char c) {
    return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
}

    public static int vowels(String str){
        int count=0;

        for(int i=0;i<str.length();i++){
            str=rr(str);
        for(int j=0;j<str.length()-1;j++){
            if(isvowel(str.charAt(j)) && isvowel(str.charAt(j+1))){
                count++;
            }
        }
        }
        return count;
    }
    public static boolean isAlpha(char c){
        return Character.isLetter(c);
    }
    
    //
    public static String rightrotation(String str,int k){
        char arr[]=str.toCharArray();
        int alpha_count=0;
        for(char c:arr){
            if(isAlpha(c))
            alpha_count++;
        }
        if(alpha_count==0)return str;
        for(int j=k%alpha_count;j>0;j--){
        int last = arr.length-1;
        while (last >= 0 && !isAlpha(arr[last])) {
            last--;
        }


    char temp = arr[last];

    
    for (int i = last - 1; i >= 0; i--) {
        if (isAlpha(arr[i])) {
            arr[last] = arr[i];
            last = i;
        }
    }
    arr[last]=temp;
}
        return new String(arr);
    }
    
// public static String longestPalindrome(String s){
//     //check whether the string is empty;
//     if(s==null || s.length()==0) return s;
//     //transform the string into character array by separating with symbols;
//     char[] t=new char[2*s.length()+3];
//     t[0]='^';
//     int index=1;
//     for(int i=0;i<s.length();i++){
//         t[index++]='#';
//         t[index++]=s.charAt(i);
//     }
//     t[index++]='#';
//     t[index++]='$';
// // initialize new array to store the maximum length
// int p[]=new int[t.length];
// // initialize center and right
// int center=0,right=0;
// for(int i=1;i<t.length-1;i++){
//     //initialize mirror;
//     int mirror=2*center-i;
//     if(i<right)
//         p[i]=Math.min(right-i,p[mirror]);
//     while (t[i+p[i]+1]==t[i-p[i]-1])
//         p[i]++;
//     if(i+p[i]>right){
//         center=i;
//         right=i+p[i];
//     }
// }
//     int maxlen=0,cur_index=0;
//     for(int i=1;i<p.length-1;i++){
//         if(p[i]>maxlen){
//             maxlen=p[i];
//             cur_index=i;
//         }
//     }
//     int start=(cur_index-maxlen)/2;
// return s.substring(start,start+maxlen);
// }
    public static void main(String[] args) {
      // String st= rightrotate("abcd", 1);
      //String str=rr("ael");
    
    //System.out.println(vowels("ae"));
    // String str="$@#";
    // str=rightrotation(str,10);
    // System.out.println(str);
    // String str=longestPalindrome("abbabb");
    // System.out.println(str);
    }
}

