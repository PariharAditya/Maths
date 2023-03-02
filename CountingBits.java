public class CountingBits 
{
public static void main(String[] args) 
{
    
}
static int[] countBits(int n) 
{
int[] ans = new int[n+1];

for (int i = 0; i <= n; i++) 
{
ans[i] = oneCount(i);
}

return ans;
}
private static int oneCount(int n) 
{
int count=0;
while (n!=0) 
{
if ((n&1)==1) count++;

n = n>>>1;
}
return count;
}    
}