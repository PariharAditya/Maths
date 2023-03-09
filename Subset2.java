import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 
{
public static void main(String[] args) 
{
    
}
static List<List<Integer>> subsets(int[] nums) 
{
Arrays.sort(nums);
List<List<Integer>> answer = new ArrayList<List<Integer>>();
int xor = 0;
//determining total subset that can be formed
int possibleSet = 1<<nums.length;
for (int i = 0; i < possibleSet; i++) 
{
List<Integer> pair = new ArrayList<Integer>();
for (int j = 0; j < nums.length; j++) 
{
if ((xor^nums[j])==0) pair.add(nums[j]);
}
ans.add(pair); 
}   
return ans;
}    
}
