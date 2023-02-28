/*
 * 0^1=1
 * 1^1=0
 * 1^0=1
 */
public class SingleElement 
{
public static void main(String[] args) 
{
int[] arr = {2,2,3};
System.out.println(Find(arr));    
}

private static int Find(int[] array) 
{
int zero = 0;
for (int i : array) 
{
zero^=i;
}
return zero;
}
}
