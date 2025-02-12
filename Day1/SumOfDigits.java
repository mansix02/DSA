package Day1;

public class SumOfDigits {

    public static int sum(int num){
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            num=num/10;
            sum=sum+lastDigit;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(246));
    }
}
