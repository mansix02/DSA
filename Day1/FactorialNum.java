package Day1;

public class FactorialNum {

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
