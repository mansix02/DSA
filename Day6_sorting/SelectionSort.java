package Day6_sorting;

public class SelectionSort {

    public static void sort(int n[]){
        for(int i=0; i<n.length; i++){
            int minPos = i;
            for(int j=i+1; j<n.length; j++){
                if(n[minPos]>n[j]){
                    minPos=j;
                }
            }
            int temp = n[minPos];
            n[minPos] = n[i];
            n[i] = temp;
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
