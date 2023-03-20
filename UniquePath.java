public class UniquePath 
{
public static void main(String[] args) 
{
System.out.println(path(3, 7));   
}
static int path(int m, int n)
{
// we're Using Combination nCk 
int TotalStep = m+n-2;
long ans = 1;

for (int i = n; i <= TotalStep; i++) 
{
//performing combination or binomial coefficient
ans=ans/(i-n+1);
}
return (int)ans;
}    
}
