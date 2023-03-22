public class PerfectSquare 
{
public static void main(String[] args)
{
System.out.println(squareCalculator(12));
}
static int squareCalculator(int n)
{
/*since every perfect square is multiple of 4 hence*/
while (n%4==0) 
   n/=4;

   //if in form of 
if(n%8==7) return 4;

for (int i = 0; i*i <n; i++) 
{
int j = (int)Math.sqrt(n-i*i);
if (i*i+j*j == n) 
{                     // If i = 0 then n can be represented as a single perfect square.
return (i==0?1:2);    // if i*i+j*j == n then 2 else 1 
}    
}
return 3;
}    
}
