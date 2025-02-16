package Day5_AQ;

// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

public class ContainDuplicates {

    public static boolean checkArray(int n[]){
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if(n[i]==n[j]){
                    return true;
                }
            }           
        }
        return false;
    }
    public static void main(String[] args) {
        int n[]={1,2,3,1};
        System.out.println(checkArray(n));
        
    }
}
