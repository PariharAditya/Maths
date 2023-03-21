public class ZeroSubArray 
{
public static void main(String[] args) 
{
int[] array = {1,3,0,0,2,0,0,4};
System.out.println(subArray(array));
}
static long subArray(int[] nums)
{
long count = 0;
long whenZeroStreakBreak = 0;
for (int i = 0; i < nums.length; i++) 
{
if(nums[i]==0) count++;

else count=0;

/*Addition of 0's count when they were contiguous like 0,0 count would be 2
 * and when the continuity break it get stored in result var  
*/
whenZeroStreakBreak+=count;  
}    
return whenZeroStreakBreak;
}    
}
/*long cnt = 0;
        int n = nums.length, j = -1;
        for(int i=0;i<n;i++) {
            if(nums[i] != 0) j=i;
            else {
                cnt += i-j;
            }
        }
        return cnt; */