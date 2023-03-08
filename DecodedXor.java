import java.util.Arrays;

public class DecodedXor 
{
public static void main(String[] args) 
{
int[] array = {1,2,3};
int first = 1;
System.out.println(Arrays.toString(decode(array, first)));
}
static int[] decode(int[] encoded, int first)
{
int[] arr = new int[encoded.length+1];
arr[0] = first;

for(int i = 0; i < encoded.length; i++) 
{
arr[i+1] = arr[i]^encoded[i];
}
return arr;
}    
}
