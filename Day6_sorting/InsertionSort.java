package Day6_sorting;

public class InsertionSort {
    
    public static void sort(int n[]){
        for(int i=1; i<n.length-1; i++){
            int curr = n[i];
            int prev = i-1;
            while(prev>=0 && n[prev]>curr){
                n[prev+1]=n[prev];
                prev--;
            }
            n[prev+1]=curr;
        }
    }

    public static void printArr(int n[]){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n[]={4,6,2,3,9,11,1,0};
        sort(n);  
        printArr(n); 
    }
    
}
