package Day4;

public class PrintSubarray {

    public static void printSubarray(int n[]){
        int ts=0;
        for(int i=0; i<n.length; i++){
            int start=i;
            for(int j=i+1; j<n.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(n[k]+",");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total "+ ts);
    }
    
    public static void main(String[] args) {
        int n[] = {2,3,4,7,6,9};
        printSubarray(n);
    }
}
