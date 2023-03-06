public class BinaryGap 
{
public static void main(String[] args) 
{
System.out.println(spaceBetween(22));   
}
static int spaceBetween(int n)
{
int[] count = new int[32];
int oneEncountered = 0;

for (int i = 0; i < 32; i++) 
{
if(((n>>i)&1)!=0) count[oneEncountered++] = i;
}

int max = 0;
for (int i = 0; i < oneEncountered-1; i++) 
{
max = Math.max(max, count[i+1]-count[i]);    
}
return max;
}
}
