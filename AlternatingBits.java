public class AlternatingBits 
{
public static void main(String[] args) 
{
System.out.println(hasAlternatingBits(11));    
}
static boolean hasAlternatingBits(int n) 
{
while (n!=0) 
{
int a = (n&1);
n=n>>>1;

if (a == (n&1)) return false;
}
return true; 
}    
}
