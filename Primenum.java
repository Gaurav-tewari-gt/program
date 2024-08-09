class Primenum{
public static boolean pn(int n){
int c=0;
for(int i=1; i<=n;i++){
if(n%i==0)
c++;
}
if(c==2)
return true;
else 
return false;
}
public static void main(String[] args){
System.out.println(pn(11));
}
}