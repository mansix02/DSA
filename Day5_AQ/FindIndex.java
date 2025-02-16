package Day5_AQ;

public class FindIndex {

    public static int find(int n[] , int target){
        for(int i=0; i<n.length; i++){
            if(n[i]==target){
                return i;
            }         
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[]={1,2,3,8};
        int target = 5;
        System.out.println(find(n , target));
        
    }
    
}
