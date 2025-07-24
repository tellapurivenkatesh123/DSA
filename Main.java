class Main{

//  private static int countDigit(int num){
//     int count=0;
// while(num>0){
//     num=num/10;
//     count++;
// }
// return count;
//  }
// -----------------------------------------------------------------------------------------------------------------------------------------------
//  private static int countDigit1(int num)  {
//     return (int) Math.log10(num)+1;
//  }
// ----------------------------------------------------------------------------------------------------------------------------------------
// private static int reverseInt(int num){ 
//     int digit=0;
//     while(num>0){
//         int rem=num%10;
//         digit=(digit*10)+rem;
//         num=num/10;
//     }
//     return digit;
// }
// ---------------------------------------------------------------------------------------------------------------------------------------------
// private static String reverseint(int num){
//     String str=Integer.toString(num);
//     String rev=new StringBuilder(str).reverse().toString();
//     return rev;
// }
//-----------------------------------------------------------------------------------------------------------------------------------------
// private static void swap(int a,int b){
//     // a=a^b;
//     // b=a^b;
//     // a=a^b;
//     // a=a+b-(b=a);
//     // a=(a^b)^(b=a);
    
    
//     System.out.println(a +" "+ b);
// }
// -----------------------------------------------------------------------------------------------------------------------------------------
// private static boolean isPrime(long n){
//     if(n==2)return true;
//     if(n<2 || n%2==0)return false;
//     for(int i=3,limit=(int) Math.sqrt(n);i<=limit;i+=2){
//         if(n%i==0)return false;
//     }
// return true;
// }
// // -------------------------------------------------------------------------------------------------------------------------------------------
// private static boolean fermatPrimeChecking(int n) {
// if(!isPrime(n))return false;
// long a;
// int up = n - 2;
// int down = 2;
// for (int i = 0; i < n-1; i++) {
//     a = (long) Math.floor(Math.random() * (up - down + 1) + down);
//     if (modPow(a, n - 1, n) != 1) {
//         return false;
//     }
// }
// return true;
// }
// private static long modPow(long a, long b, long c) {
//     long res = 1;
//     for (int i = 0; i < b; i++) {
//         res *= a;
//         res %= c;
//     }
//     return res % c;
// }
//-------------------------------------------------------------------------------------------------------------------------------------

// private static ArrayList<Integer> primeFactors(int n){
//     ArrayList<Integer> arr=new ArrayList<>();
//     if(n<2)return arr;
//     while(n%2==0){arr.add(2);
//         n/=2;
//     }
//     for(int i=3;i<=(int)Math.sqrt(n);i++){
//         if(n%i==0)arr.add(i);
//     }
//     if(n>2) arr.add(n);
//     return arr;
// }
//-------------------------------------------------------------------------------------------------------------------------
// private static HashSet<Integer> squareFreeInteger(int n){
//     HashSet<Integer> set=new HashSet<>();
//     if(n<2)return set;
//     while(n%2==0)
//     {
//     set.add(2);
//     n/=2;
//     }
    
//     for(int i=3;i<=Math.sqrt(n);i++){
//         if(n%i==0)set.add(i);
//     }
//     if(n>2) set.add(n);
//     return set;
// }
//-------------------------------------------------------------------------------------------------------------------------------------------------
// private static int mobiusFunction(int n){
//     if(n<2)return 1;
//     int pfs=0;
//     for(int i=2;i*i<=n;i++){
//         if(n%i==0){
//             if((n/i)%i==0)return 0;
//         }
//         pfs++;
//         while(n%i==0){
//             n/=i;
//         }
//     }
//     if(n>1)pfs++;
//     return pfs%2==0?1:-1;
// }
//--------------------------------------------------------------------------------------------------------------------------
// private static int absoluteMax(int... nums){
//     int absMax=nums[0];
//     for(int i=1;i<nums.length;i++){
//         if(Math.abs(nums[i])>Math.abs(absMax) || (Math.abs(nums[i])==Math.abs(absMax) && nums[i]>absMax)){
//             absMax=nums[i];
//         }
//     }
//     return absMax;
// ------------------------------------------------------------------------------------------------------------------------------------------

// private static <T> List<T>  sum(T... a)
// {
//     return Arrays.asList(a);
//-------------------------------------------------------------------------------------------------------------------------
// }
//  private static  int getMinValue(int ... arr){
//     if(arr.length==0)throw new IllegalArgumentException("array should not be empty");
//     var absm= new Object() {int value=arr[0];};
//     Arrays.stream(arr)
//     .skip(1)
//     .filter(nums->Math.abs(nums)<=Math.abs(absm.value))
//     .forEach(nums -> absm.value=Math.min(absm.value,nums));
//     return absm.value;
//  }
//--------------------------------------------------------------------------------------------------------------------
//  private static int absoluteValue(int num){
//  return num<0?-num:num;
// }
//---------------------------------------------------------------------------------------------------------------------
// private static int aliquoteSum(int num){
//     var sum=new Object(){int value=0;};
//      IntStream.iterate(1,i->++i)
//      .limit(num/2)
//      .filter(i->num%i==0)
//      .forEach(i->sum.value +=i);
//     return sum.value;
// }
public static void main(String args[]){
// int count=countDigit(100);
// int count=countDigit1(101);
// int count = reverseInt(100);
// System.out.println(count);
// String str=reverseint(1000);
// System.out.println(str);
//swap(10,5);
// swap(5, 10);
//long start = System.nanoTime();
//System.out.println(isPrime(561));
//System.out.println(fermatPrimeChecking(7));
//System.out.println(isPrime(4294967297L));
//long end = System.nanoTime();
//-------------------------------System.out.println("Execution time (nanoseconds): " + (end - start));
//System.out.println(primeFactors(20));
//System.out.println(squareFreeInteger(20));//unique prime facctors
// System.out.println(mobiusFunction(385));
//System.out.println(absoluteMax(1000,-1000));
//System.out.println(Arrays.asList(sum(1,2,3,4)));
// int a=getMinValue(1,-1,-1000);
// System.out.println(a);
// System.out.println(absoluteValue(-2));
// var f1=new ADTFraction(1,2);
// var f2=new ADTFraction(1,3);
// System.out.println(f1.plus(f2));
// System.out.println(aliquoteSum(10));
}
}