package Day2_pattern;

public class ReverseStar {
    
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=4-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
    
}
