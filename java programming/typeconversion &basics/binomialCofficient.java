import java.util.*;
public class binomialCofficient{

    public static int factorial(int n){
        int f = 1;
        
        for(int i =1; i<=n; i++){
            f = f * i;
        }
        return f;   //factorial of n
    }

  
    public static int binCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bioCoff = fact_n / (fact_r * fact_nmr);
       
        return bioCoff;
    }
    public static void main(String args[]){
        int n =5;
        int r = 3;
       System.out.println(binCoff(5,2));
    }
}