package Day6_sorting;

public class BubbleSort {

    public static void sort(int n[]){
        for(int turn=0; turn<n.length-1; turn++){
            for(int i=0; i<n.length-1-turn; i++){
                if(n[i]>n[i+1]){
                    int temp = n[i];
                    n[i] = n[i+1];
                    n[i+1] = temp;
                }
            }
        }
    }

    public static void printArr(int n[]){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n[]={4,6,2,3,9,11,1};
        sort(n);  
        printArr(n); 
    }
}
