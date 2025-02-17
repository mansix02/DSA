package Day6_sorting;

import java.util.Arrays;

public class InbuiltSort {

    public static void printArr(int n[]){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n[]={4,6,2,3,9,11,1,0};
        Arrays.sort(n);
        printArr(n); 
    }
}
