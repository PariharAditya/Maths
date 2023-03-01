public class OnesBit 
{
public static void main(String[] args) 
{
    
}
static int count(int n)
{
int count = 0;
while (n!=0) 
{
if((n&1)==1) ++count;   
}
n>>=1;
return count;
}    
}
