public class XorOperation 
{
public static void main(String[] args) 
{
System.out.println(xorOperation(5, 0));   
}
static int xorOperation(int n, int start) 
{
int[] nums = new int[n];
int xor = 0;
for (int i = 0; i < n; i++) 
{
nums[i] = start+2*i;
xor^=nums[i];
}
return xor;
}    
}