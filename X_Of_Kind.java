public class X_Of_Kind 
{
public static void main(String[] args) 
{
    
}
static boolean hasGroupsSizeX(int[] deck) 
{
int[] count = new int[10000];
for (int c: deck)
    count[c]++;
int c = -1;
for (int j = 0; j < 10000; j++) 
{
    if (count[j]>0)
    {
      if (c==-1) c = count[j]; 
      
      else c= gcd(c, count[j]);
    }
}
return c>=2;
}

static int gcd(int a, int b)
{
    return a==0?b:gcd(a%b, b);
}    
}
