package Day1;

public class PalindromeNum {

    public static int reverseNum(int num){
        int reverseNum=0;
        while (num>0) {
            int lastDigit= num%10;
            num=num/10;
            reverseNum=reverseNum*10+lastDigit;
        }
        return reverseNum;
    }

    public static boolean isPalindrome(int num){
        if(reverseNum(num)==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
