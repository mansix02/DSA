package Day1;

public class BinomialCoeffi {

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static int binomialc(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int result= fact_n / fact_r *fact_nr;
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(binomialc(4,2));
    }
}
