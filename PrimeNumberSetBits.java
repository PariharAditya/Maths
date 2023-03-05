public class PrimeNumberSetBits 
{
public static void main(String[] args) 
{
System.out.println(countPrimeSetBits(6, 10));
}
static int countPrimeSetBits(int left, int right) 
{
 int count = 0;
 for (int i = left; i <= right; i++) 
 {
  if(isPrime(Integer.bitCount(i))) count++;   
 }
 return count;
}

public static boolean isPrime(int n) 
{
if(n<=1) return false;
if(n==2) return true;
if((n&1)==0) return false;

int maxDivisor = (int) Math.sqrt(n);
for (int d = 3; d <= maxDivisor; d += 2) 
{
 if (n%d==0) return false;
}
return true;
}
}
