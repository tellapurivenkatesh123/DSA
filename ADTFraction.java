// public record ADTFraction(int numerator,int denominator){
// public ADTFraction{
//     if(denominator==0)throw new IllegalArgumentException("denominator cannot be zero");
// }

// public ADTFraction plus(ADTFraction fraction){
//     var numerator=(this.numerator*fraction.denominator)+(this.denominator*fraction.numerator);
//     var denominator=this.denominator*fraction.denominator;
// return new ADTFraction(numerator,denominator);
// }
// public ADTFraction sub(ADTFraction fraction){
//     var numerator=this.numerator*fraction.denominator-this.denominator*fraction.numerator;
//     var denominator=this.denominator*fraction.denominator;
//     return  new ADTFraction(numerator,denominator);
// }
// public ADTFraction reciprocal(){
//     return new ADTFraction(this.denominator,this.numerator);
// }
// public ADTFraction times( int number ){
//     return times(new ADTFraction(number,1));
// }
// public ADTFraction times(ADTFraction fraction){
//     var numerator=this.numerator*fraction.numerator;
//     var denominator=this.denominator*fraction.denominator;
//     return new ADTFraction(numerator,denominator);
// }
// public String tostring(){
//     return String.format("%d/%d",this.numerator,this.denominator);
// }
// public static void main(String args[]){
//     var f1=new ADTFraction(1,2);
//     //Sfystem.out.println(f1.tostring());
//     // System.out.println(f1.times(f1));
//     // System.out.println(f1.sub(f1)+"="+f1.numerator/f1.denominator);
//     // System.out.println(f1.reciprocal());
//     // var f2=f1.plus(f1);
//     // System.out.println(f2+" = "+f2.numerator/f2.denominator);
// }
// }