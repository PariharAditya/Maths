/*https://leetcode.com/problems/reverse-bits/solutions/2680791/handwritten-solution/ */
public class ReverseBits 
{
public static void main(String[] args) 
{
int x = 56;
System.out.println(rvsBits(x));
}

private static int rvsBits(int n) 
{
int ans = 0;
for (int i = 0; i < 32; i++) 
{
int lsb = n&1; //LEAST SIGNIFICANT BIT 0000000.....1 -> 1 is LSB
int shift = lsb<<(31-i); // shifting position opposite to current position
ans|=shift; 
n = n>>1; // for going to next bit 
}
return ans;
}
static int multiplyOperator(int n)
{
int ans = 0;
for (int i = 0; i < 32; i++) 
{
ans<<=1; // shifting ans left by 1 position  
ans+= ans+(n&1); // taking LSB and appending it 
n>>=1;   // deleting 
}
return n;
}
}
