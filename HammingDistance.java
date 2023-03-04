public class HammingDistance 
{
public static void main(String[] args) 
{
System.out.println(distance(1, 4)); 
}
static int distance(int x,int y)
{
int count = 0;
while (x!=0 || y!=0) 
{
if((x&1)!=(y&1)) count++;

x>>=1;
y>>=1;
}
return count;
}    
}
