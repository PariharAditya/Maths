import java.util.Arrays;

public class CountPrime 
{
public static void main(String[] args)
{
System.out.println(count(1));
}
static int count(int n)
{
    int ans = 0;
        if(n <= 2){
            return ans;
        }
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = 2*i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                ans++;  
            }
        }
        return ans;
}    
}
