import java.util.ArrayList;

public class GrayCode 
{
public static void main(String[] args) 
{
    
}
static ArrayList<Integer> code(int n)
{
ArrayList ans=new ArrayList();
for(int i=0;i<(1<<n);i++){
  ans.add(i^(i>>1));   // Gray code sequence creation i>>1 means Right shifting or division by 2 then XORing(same = 0 different = 1)
}
return ans;
}    
}
