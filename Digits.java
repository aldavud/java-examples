public class Digits{
public static int[] digits(int n,int b){
if(n<b){return new int[]{n};}else{
int[] p=Digits.digits(n/b,b);
int l=p.length;
int[] r=new int[l+1];
System.arraycopy(p,0,r,0,l);
r[l]=n%b;
return r;
}}
private static void print(int[] r){
for (int i=0;i<r.length;i++){
System.out.print(r[i]+" ");
}System.out.println();}
public static void main(String[] args){
Digits.print(Digits.digits(10242,10));
Digits.print(Digits.digits(0x10242,16));
}}
