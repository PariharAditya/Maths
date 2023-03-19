import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber 
{
public static void main(String[] args) 
{
// System.out.println(function(11));
}
static List<Integer> selfDividingNumbers(int left, int right) 
{
 List<Integer> list=new ArrayList<>();
 for(int i=left;i<=right;i++)
 {
    if(dividing(i)) list.add(i);
 }
 return list;
}
static boolean dividing(int n1)
{
    if(n1<=0)
    return false;
    int n=n1;
    while(n1!=0){
        int ans=0;
        ans=n1%10;
        if(ans==0||n%ans!=0){
       return false;
        }
        n1/=10;
    }

return true;

}
}
/*class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            util(i,ans);
        }
        return ans;
    }
    
    private void util(int num,List<Integer> ans){
        int rem;
        int key =num;
        // System.out.println("key: "+key);
        while(num!=0){
            // System.out.println("num: "+num);
            rem=num%10;
            // System.out.println("rem: "+rem);
            if(rem == 0 || (key%rem) != 0){
                // System.out.println("key Break: "+key);
                return;
            }
            num=num/10;
        }
        ans.add(key);
    }
} */