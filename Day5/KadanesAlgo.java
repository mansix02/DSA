package Day5;

public class KadanesAlgo {


    //if all numbers in array are negative so it print 0.
    public static void kadanes(int n[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<n.length; i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }

    //if all numbers are negative so it will print the smallest negative number.
    public static void kadanesNeg(int n[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;
        int smallestNegative = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                allNegative = false;
            }
            smallestNegative = Math.max(smallestNegative, n[i]);
            cs = cs + n[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        if (allNegative) {
            System.out.println(smallestNegative);
        } else {
            System.out.println(ms);
        }
    }
    
    public static void main(String[] args) {
        int n[]={-3,-2,-4,-5,-9};
        kadanes(n);
    }
}




