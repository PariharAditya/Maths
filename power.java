public class power {
    public static void main(String[] args) {
        System.out.println(calculator(2, 3));
    }

    static double calculator(int x, int n) 
    {
        if (n==0) return 1.0;
        
        if (n<0) 
        {
         x = (int) (1.0/x);  
         n = -n;  
        }

        double result = 1.0;
        while (n>0) 
        {
         if ((n&1)==0) 
         {
         result*=x;   
         }    

         x*=x;
         n>>=1;
        }

        return result;
    }
}
