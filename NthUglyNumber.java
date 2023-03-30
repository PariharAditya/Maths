public class NthUglyNumber 
{
public static void main(String[] args) 
{
   System.out.println(nthNumber(3, 2, 3, 5)); 
}
static int nthNumber(int n, int a, int b, int c)
{
int start=1;
int end = Integer.MAX_VALUE;

int ab = lcm(a, b);
int ac = lcm(a, c);
int bc = lcm(b,c);
int abc = lcm(ab,c);

while (start<end) 
{
int mid = start+(end-start)/2;
int count = mid/a+mid/b+mid/c-mid/ab-mid/ac-mid/bc+mid/abc;

if (count<n) start = mid+1;    

else end = mid;
}
return start;
}    
static int gcd(int a, int b)
{
 return b==0?a:gcd(b,a%b);
}    

static int lcm(int x, int y)
{
return x*y/gcd(x, y);
}
}