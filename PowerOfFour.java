/*We need to find the number of digits in base 4 form.*/
public class PowerOfFour 
{
public static void main(String[] args) 
{
 System.out.println(isPowerOfFour(9));   
}
static boolean isPowerOfFour(int n)
{
return (Math.log10(n)/Math.log10(4))%1==0;
}    
}