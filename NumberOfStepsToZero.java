/*lets assume value of num is 2 and in binary that would be "010". So, when I rightshift num by one place (num>>1) i get "001" which is 1 in decimal number system. Now it can be observed that by rightshifting number becomes half. so istead of using num=num/2, num=nums>>1 can also be used.
And if num is a odd number just subtract 1 from num. */

public class NumberOfStepsToZero 
{
public static void main(String[] args) 
{
System.out.println(numberOfSteps(8));
}
static int numberOfSteps(int num) 
{
int count = 0;
while (num > 0) 
{
 num = (((num&1)!=0))?num-1 : num>>1;
 count++;
}
return count;   
}    
}
