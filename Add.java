public class Add 
{
public static void main(String[] args) 
{
System.out.println(addFxn(38));
System.out.println(oneLiner(38));
}
static int addFxn(int num)
{
while (num/10!=0) 
{
int ans = 0;
while(num>0) 
{
    int rem = num % 10;
    ans+=rem;
    num /= 10;
}

if(ans/10==0) return ans;

else  num = ans;
}
return num;
}
static int oneLiner(int n)
{
    if (n==0) return 0;
    return n%9==0?0:n%9;
}
}    

