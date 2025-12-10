public class Strings {
    public static String rightrotate(String str,int n){
        n=n%str.length();
        return str.substring(str.length()-n)+str.substring(0,str.length()-n);
    }
    public static void main(String[] args) {
       String st= rightrotate("abcd", 1);
       System.out.println(st);
    }
}

