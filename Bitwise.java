public class Bitwise 
{
public static void main(String[] args) 
{
System.out.println(rangeBitswise(4, 7));    
}
static int rangeBitswise(int left, int right)
{
int i=0;
while(left!=right)
{
 left=left>>1;
 right=right>>1;
 i++;
}
return right<<i;
}    
}
