public class FlowerBed 
{
public static void main(String[] args) 
{
int[] array = {1,0,0,0,1};
System.out.println(canPlaceFlowers(array, 1));
}
static boolean canPlaceFlowers(int[] flowerbed, int n) 
{
int count = 0;
for (int i = 0; i < flowerbed.length-1; i++) 
{
int next = (i == flowerbed.length-1) ? 0:flowerbed[i+1];
int prev = (i == 0) ? 0:flowerbed[i-1];

if (flowerbed[i]==0) 
{
if (next==0 && prev==0) 
{
flowerbed[i] = 1;
count++;
}
}    
}
return count==n;        
}    
}
