/*A trailing zero is created by the factor of 2X5 i.e. any number will have 2 n 5 but count of 2 would be more and hence we only need to coun
 * count number of 5 present 
 */
public class FactorialZero 
{
public static void main(String[] args) 
{
System.out.println(trailingZeroes(7));
}
static int trailingZeroes(int n) 
{
int count = 0;
for (int i = 5; i < n; i*=5) 
{
count=+n/i;
}
return count;
}
}
