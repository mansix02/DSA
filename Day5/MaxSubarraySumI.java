package Day5;

public class MaxSubarraySumI {
    
    public static void maxSubarraySumI(int n[]){
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0; i<n.length; i++){
            int start=i;
            for(int j=i; j<n.length; j++){
                int end = j;
                currsum =0;
                for(int k=start; k<=end; k++){
                    currsum+=n[k];
                }
                System.out.println(currsum);
                if (maxsum<currsum) {
                    maxsum=currsum;                  
                }
            }
        }
        System.out.println(" max sum = "+ maxsum);
    }
    
    public static void main(String[] args) {
        int n[] = {2,3,4,7,6,9};
        maxSubarraySumI(n);
    }

}
