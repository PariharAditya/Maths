import java.util.Arrays;

public class MinMoves 
{
public static void main(String[] args) 
{
int[] array = {1,10,2,9};
System.out.println(moves(array));
}
static int moves(int[] nums)
{
Arrays.sort(nums);
int median = nums[nums.length/2];
int count = 0;
for (int i = 0; i < nums.length; i++) 
{
count+=Math.abs(nums[i]-median);
}
return count;
}    
}
