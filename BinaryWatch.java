import java.util.ArrayList;
import java.util.List;

public class BinaryWatch 
{
public static void main(String[] args) 
{
    
}
static List<String> readBinaryWatch(int turnedOn) 
{
List<String> ans = new ArrayList<String>();

for(int hour = 0; hour < 12; hour++) 
{
for(int minute = 0; minute < 60; minute++) 
{
if(Integer.bitCount(hour*64+minute) == turnedOn) ans.add(String.format("%d:%02d", hour, minute));    
}    
}
return ans;
}    
}
