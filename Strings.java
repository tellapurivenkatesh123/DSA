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
    

    public static void main(String[] args) {
      // String st= rightrotate("abcd", 1);
      //String str=rr("ael");
    
    //System.out.println(vowels("ae"));
    // String str="$@#";
    // str=rightrotation(str,10);
    // System.out.println(str);
    }
}

