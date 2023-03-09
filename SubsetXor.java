public class SubsetXor 
{
public static void main(String[] args) 
{
    
}
static int XORSubset(int[] nums)    
{
int TotalSum = 0;
for (int i = 0; i < nums.length; i++) 
{
int sum = 0;
for (int j = 0; j < nums.length; j++) 
{
sum^=nums[j];    
}
sum+=TotalSum;    
}
return TotalSum;
}
}
